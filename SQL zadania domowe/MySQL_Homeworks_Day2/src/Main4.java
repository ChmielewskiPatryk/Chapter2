import java.sql.*;
import java.util.Scanner;
//pobierze od użytkownika nazwę kina,
//wybrane kino zostanie wyświetlone razem z filmami w formacie:
//Kino o id 12:
//* Film o id 5
//* Film o id 6
//* Film o id 11
public class Main4 {
    private static String DB_URL = "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static String DB_USER = "root";
    private static String DB_PASS = "test1234";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give cinema name:");
        String cinema = sc.nextLine();
        String QUERY = "SELECT * FROM screenings AS sc JOIN movies ON sc.movie_id = movies.id JOIN cinemas ON sc.cinema_id = cinemas.id WHERE name = ?";
        try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            PreparedStatement preStmt = con.prepareStatement(QUERY);
            preStmt.setString(1, cinema);
            ResultSet rs = preStmt.executeQuery();
            System.out.println(cinema);
            while (rs.next()) {
                String movie = rs.getString("title");
                System.out.println(movie);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
