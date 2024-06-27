
import java.util.List;

public interface ExpenseDAO {
    void addExpense(Expense expense);
    void updateExpense(Expense expense);
    void deleteExpense(int expenseId);
    Expense getExpenseById(int expenseId);
    List<Expense> getAllExpenses();
    List<Expense> getExpensesByCategory(ExpenseCategory category);
    List<Expense> getExpensesByMonth(int month, int year);
    double getTotalExpensesForMonth(int month, int year);
}

