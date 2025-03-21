import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class prg1 {
    // Database credentials and URL
    static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase"; // Replace "mydatabase" with your database name
    static final String USER = "root"; // Replace with your MySQL username
    static final String PASS = "password"; // Replace with your MySQL password

    public static void main(String[] args) {
        Connection conn = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            System.out.println("Connecting to the MySQL database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            if (conn != null) {
                System.out.println("Connected to the database successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to connect to the database!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("MySQL JDBC Driver not found!");
        } finally {
            try {
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
