import java.sql.*;
import java.util.Scanner;

//pobierze od użytkownika tytuł filmu do wyświetlenia,
//wyświetli wybrany film – nazwę, opis i rating,
//jeżeli film nie zostanie odnaleziony w bazie danych, program ma wyświetlić komunikat: "Nie odnaleziono filmu".
public class Main3 {

    private static String DB_URL = "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static String DB_USER = "root";
    private static String DB_PASS = "test1234";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give title:");
        String titleToShow = sc.nextLine();
        String QUERY = "SELECT title,description,rating FROM movies WHERE title = ?";
        try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            PreparedStatement preStmt = con.prepareStatement(QUERY);
            preStmt.setString(1, titleToShow);
            ResultSet rs = preStmt.executeQuery();
            if (rs.next()) {
                String title = rs.getString("title");
                String description = rs.getString("description");
                double rating = rs.getDouble("rating");
                System.out.println(title + " " + description + " " + rating);
            }else{
                System.out.println("Movie not found");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
