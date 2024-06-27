
import java.util.List;
import java.util.Scanner;

public class ExpenseTracker {

    private ExpenseDAO expenseDAO;
    private Scanner scanner;

    public ExpenseTracker() {
        expenseDAO = new ExpenseDAOImpl(); // Initialize DAO implementation
        scanner = new Scanner(System.in); // Initialize Scanner for user input
    }

    public void start() {
        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    updateExpense();
                    break;
                case 3:
                    deleteExpense();
                    break;
                case 4:
                    viewAllExpenses();
                    break;
                case 5:
                    viewExpensesByCategory();
                    break;
                case 6:
                    viewExpensesByMonth();
                    break;
                case 7:
                    generateMonthlyReport();
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Exiting Expense Tracker. Goodbye!");
    }

    private void displayMenu() {
        System.out.println("Expense Tracker Menu:");
        System.out.println("1. Add Expense");
        System.out.println("2. Update Expense");
        System.out.println("3. Delete Expense");
        System.out.println("4. View All Expenses");
        System.out.println("5. View Expenses by Category");
        System.out.println("6. View Expenses by Month");
        System.out.println("7. Generate Monthly Report");
        System.out.println("8. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addExpense() {
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter category (FOOD, TRANSPORTATION, UTILITIES, ENTERTAINMENT, OTHER): ");
        ExpenseCategory category = ExpenseCategory.valueOf(scanner.nextLine().toUpperCase());
        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        Expense expense = new Expense(date, amount, category, description);
        expenseDAO.addExpense(expense);
        System.out.println("Expense added successfully.");
    }

    private void updateExpense() {
        System.out.print("Enter expense ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        Expense expense = expenseDAO.getExpenseById(id);
        if (expense != null) {
            System.out.print("Enter new date (YYYY-MM-DD): ");
            String date = scanner.nextLine();
            System.out.print("Enter new amount: ");
            double amount = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter new category (FOOD, TRANSPORTATION, UTILITIES, ENTERTAINMENT, OTHER): ");
            ExpenseCategory category = ExpenseCategory.valueOf(scanner.nextLine().toUpperCase());
            System.out.print("Enter new description: ");
            String description = scanner.nextLine();

            expense.setDate(date);
            expense.setAmount(amount);
            expense.setCategory(category);
            expense.setDescription(description);
            expenseDAO.updateExpense(expense);
            System.out.println("Expense updated successfully.");
        } else {
            System.out.println("Expense not found.");
        }
    }

    private void deleteExpense() {
        System.out.print("Enter expense ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        expenseDAO.deleteExpense(id);
        System.out.println("Expense deleted successfully.");
    }

    private void viewAllExpenses() {
        List<Expense> expenses = expenseDAO.getAllExpenses();
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
        } else {
            for (Expense expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    private void viewExpensesByCategory() {
        System.out.print("Enter category to view (FOOD, TRANSPORTATION, UTILITIES, ENTERTAINMENT, OTHER): ");
        ExpenseCategory category = ExpenseCategory.valueOf(scanner.nextLine().toUpperCase());
        List<Expense> expenses = expenseDAO.getExpensesByCategory(category);
        if (expenses.isEmpty()) {
            System.out.println("No expenses found in this category.");
        } else {
            for (Expense expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    private void viewExpensesByMonth() {
        System.out.print("Enter month (1-12): ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());
        List<Expense> expenses = expenseDAO.getExpensesByMonth(month, year);
        if (expenses.isEmpty()) {
            System.out.println("No expenses found for this month.");
        } else {
            for (Expense expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    private void generateMonthlyReport() {
        System.out.print("Enter month (1-12): ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter year: ");
        int year = Integer.parseInt(scanner.nextLine());
        double total = expenseDAO.getTotalExpensesForMonth(month, year);
        System.out.println("Total expenses for " + month + "/" + year + ": $" + total);
    }

    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        tracker.start();
    }
}

