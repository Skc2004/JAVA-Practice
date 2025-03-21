import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class prg6 {
    // Database credentials and URL
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase"; // Replace "mydatabase" with your database name
    static final String USER = "root"; // Replace with your MySQL username
    static final String PASS = "password"; // Replace with your MySQL password

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            System.out.println("Connecting to the MySQL database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Prepare an SQL DELETE statement
            String sql = "DELETE FROM employees WHERE employee_id = ?";
            pstmt = conn.prepareStatement(sql);

            // Set the parameter for the prepared statement
            pstmt.setInt(1, 5);  // Replace with the actual employee ID you want to delete

            // Execute the DELETE statement
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Employee record deleted successfully!");
            } else {
                System.out.println("No record found with the given employee ID.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to delete the employee record!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("MySQL JDBC Driver not found!");
        } finally {
            // Close resources
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
