
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDAOImpl implements ExpenseDAO {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/expense_tracker";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "030902Aj";
    private Connection conn;

    public ExpenseDAOImpl() {
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addExpense(Expense expense) {
        String sql = "INSERT INTO expenses (date, amount, category, description) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, expense.getDate());
            pstmt.setDouble(2, expense.getAmount());
            pstmt.setString(3, expense.getCategory().name());
            pstmt.setString(4, expense.getDescription());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateExpense(Expense expense) {
        String sql = "UPDATE expenses SET date = ?, amount = ?, category = ?, description = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, expense.getDate());
            pstmt.setDouble(2, expense.getAmount());
            pstmt.setString(3, expense.getCategory().name());
            pstmt.setString(4, expense.getDescription());
            pstmt.setInt(5, expense.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteExpense(int expenseId) {
        String sql = "DELETE FROM expenses WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, expenseId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Expense getExpenseById(int expenseId) {
        String sql = "SELECT * FROM expenses WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, expenseId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return extractExpenseFromResultSet(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Expense> getAllExpenses() {
        List<Expense> expenses = new ArrayList<>();
        String sql = "SELECT * FROM expenses";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                expenses.add(extractExpenseFromResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expenses;
    }

    @Override
    public List<Expense> getExpensesByCategory(ExpenseCategory category) {
        List<Expense> expenses = new ArrayList<>();
        String sql = "SELECT * FROM expenses WHERE category = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, category.name());
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                expenses.add(extractExpenseFromResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expenses;
    }

    @Override
    public List<Expense> getExpensesByMonth(int month, int year) {
        List<Expense> expenses = new ArrayList<>();
        String sql = "SELECT * FROM expenses WHERE MONTH(date) = ? AND YEAR(date) = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, month);
            pstmt.setInt(2, year);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                expenses.add(extractExpenseFromResultSet(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return expenses;
    }

    @Override
    public double getTotalExpensesForMonth(int month, int year) {
        double total = 0;
        String sql = "SELECT SUM(amount) AS total FROM expenses WHERE MONTH(date) = ? AND YEAR(date) = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, month);
            pstmt.setInt(2, year);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                total = rs.getDouble("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return total;
    }

    private Expense extractExpenseFromResultSet(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String date = rs.getString("date");
        double amount = rs.getDouble("amount");
        ExpenseCategory category = ExpenseCategory.valueOf(rs.getString("category"));
        String description = rs.getString("description");
        return new Expense(id, date, amount, category, description);
    }
}


