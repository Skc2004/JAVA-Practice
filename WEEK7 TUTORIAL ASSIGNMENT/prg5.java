import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class prg5 {
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

            // Prepare an SQL UPDATE statement
            String sql = "UPDATE orders SET order_status = ?, order_total = ? WHERE order_id = ?";
            pstmt = conn.prepareStatement(sql);

            // Set the parameters for the prepared statement
            pstmt.setString(1, "Shipped");  // Replace with the actual status
            pstmt.setDouble(2, 250.75);     // Replace with the actual order total
            pstmt.setInt(3, 1);             // Replace with the actual order ID

            // Execute the UPDATE statement
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("The order has been updated successfully!");
            } else {
                System.out.println("No order was updated.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to update the order!");
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
