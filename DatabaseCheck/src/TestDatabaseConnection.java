
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabaseConnection {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/expense_tracker";  // Replace with your database URL
        String username = "root";  // Replace with your MySQL username
        String password = "030902Aj";  // Replace with your MySQL password

        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Connected to the database.");
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Failed to connect to the database.");
        }
    }
}
