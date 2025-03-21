import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class prg2 {
    // Database credentials and URL
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase"; // Replace "mydatabase" with your database name
    static final String USER = "root"; // Replace with your MySQL username
    static final String PASS = "password"; // Replace with your MySQL password

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            System.out.println("Connecting to the MySQL database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create a statement object to execute the query
            stmt = conn.createStatement();

            // Execute a SELECT query
            String sql = "SELECT * FROM customers"; // Replace with your table name
            rs = stmt.executeQuery(sql);

            // Process the result set
            System.out.println("Customer records:");
            while (rs.next()) {
                // Assuming the table has columns id, name, and email; adjust accordingly
                int id = rs.getInt("id");               // Change "id" to your actual column name
                String name = rs.getString("name");     // Change "name" to your actual column name
                String email = rs.getString("email");   // Change "email" to your actual column name

                // Print the values
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to execute the query!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("MySQL JDBC Driver not found!");
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
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
