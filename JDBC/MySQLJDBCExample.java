import java.sql.*;

public class MySQLJDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "mypassword";

        try {
            // Step 1: Load Driver (optional in JDBC 4.0+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Step 3: Create Statement
            Statement stmt = conn.createStatement();

            // Step 4: Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // Step 5: Process Results
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }

            // Step 6: Close Resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
