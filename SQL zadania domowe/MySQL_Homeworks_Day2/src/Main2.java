import java.sql.*;
//napisz program, który wyświetli wszystkie filmy (powinien wyświetlić się opis, rating i lista kin, które mają go w swoim repertuarze).
public class Main2 {
    private static String DB_URL = "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static String DB_USER = "root";
    private static String DB_PASS = "test1234";

    public static void main(String[] args) {
        String QUERY = "SELECT title,description,rating,name  FROM screenings JOIN movies ON screenings.movie_id = movies.id JOIN cinemas ON screenings.cinema_id = cinemas.id";
        try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            while(rs.next()){
                String title = rs.getString("title");
                String description = rs.getString("description");
                String name = rs.getString("name");
                double rating = rs.getDouble("rating");
                System.out.println(title+" "+description+" "+name+" "+rating);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
