import java.sql.*;

public class MySQLPreparedStatementExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "mypassword";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            // Step 1: Create PreparedStatement
            String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);

            // Step 2: Set Parameters
            pstmt.setString(1, "Alice");
            pstmt.setString(2, "alice@example.com");

            // Step 3: Execute Update
            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");

            pstmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
