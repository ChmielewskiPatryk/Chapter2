import java.sql.*;

//CREATE TABLE users(id int(11) NOT NULL  AUTO_INCREMENT, email VARCHAR(255) NOT NULL UNIQUE,username VARCHAR(255) NOT NULL,password VARCHAR(60) NOT NULL, PRIMARY KEY(id));
//INSERT INTO users(email,username,password) VALUES ('dupa@dupa.com','dukep','dsa123');
//UPDATE users SET email = "newEmail", username = "newUserName", password = "newPassword" where id =1;
//SELECT * FROM users WHERE id =1;
//DELETE FROM users WHERE id = 1;
//SELECT * FROM users


public class DbUtil {
    private static String DB_URL = "jdbc:mysql://localhost:3306/workshop?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static String DB_USER = "root";
    private static String DB_PASS = "test1234";

    public static Connection connect() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        return conn;
    }



    public static void getUsers(Connection conn) throws SQLException {
        String QUERY = "SELECT * FROM users";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);
        while (rs.next()) {
            int id = rs.getInt("id");
            String email = rs.getString("email");
            String userName = rs.getString("username");
            String password = rs.getString("password");
            System.out.println("id: " + id + " email: " + email + " username: " + userName + " password: " + password);
        }
    }
    public static void deleteUser(Connection conn, int id) throws SQLException{
        String QUERY = "DELETE FROM users WHERE id = ?";
        PreparedStatement preStmt = conn.prepareStatement(QUERY);
        preStmt.setInt(1, id);
        preStmt.executeUpdate();
    }
}
