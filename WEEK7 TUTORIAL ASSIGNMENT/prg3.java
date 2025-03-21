import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class prg3 {
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

            // Prepare an SQL INSERT statement
            String sql = "INSERT INTO products (product_name, product_price, product_quantity) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            // Set the parameters for the prepared statement
            pstmt.setString(1, "New Product"); // Replace with actual product name
            pstmt.setDouble(2, 99.99);         // Replace with actual product price
            pstmt.setInt(3, 10);               // Replace with actual product quantity

            // Execute the INSERT statement
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("A new product has been inserted successfully!");
            } else {
                System.out.println("No product was inserted.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to insert the product!");
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
