package pl.coderslab.mysql.javamysql;
import java.sql.*;

public class DBUtil {
    private static String DB_URL = "jdbc:mysql://localhost:3306/products_ex?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private   static  String DB_USER = "root";
    private static String DB_PASS = "kacper123!";

    public static Connection connect() throws SQLException{
        Connection conn = DriverManager.getConnection(DB_URL , DB_USER, DB_PASS);
        return conn;
    };
    public static void insert(Connection conn, String query, String... params) {
        try ( PreparedStatement statement = conn.prepareStatement(query)) {
            for (int i = 0; i < params.length; i++) {
                statement.setString(i + 1, params[i]);
            }
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
