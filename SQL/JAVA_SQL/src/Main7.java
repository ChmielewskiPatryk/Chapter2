//W pliku Main7.java:
//
//pobierz z bazy wszystkie kina,
//dla każdego pobranego wiersza, wyświetl id, nazwę i adres kina na konsoli,
//pobierz z konsoli od użytkownika informację czy chce dokonać edycji lub usunięcia (ma wpisać e jeżeli edycja,
//u jeżeli usunięcie, x jeżeli wyjście z programu).
//Odpytanie powinno odbywać się w pętli,
//jeżeli wybrał e lub u, odpytujemy o id wiersza do edycji/usunięcia,
//w przypadku edycji, pobieramy nową nazwę oraz adres i modyfikujemy dane, następnie wyświetlamy wszystkie wiersze ponownie,
//w przypadku usunięcia, prosimy o potwierdzenie przez wpisanie T lub N, po wybraniu T, usuwamy wiersz i wyświetlamy wszystkie wiersze ponownie.

import java.sql.*;
import java.util.Scanner;

public class Main7 {
    private static String DB_URL = "jdbc:mysql://localhost:3306/cinemas_ex?useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
    private static String DB_USER = "root";
    private static String DB_PASS = "test1234";

    public static void main(String[] args) {
        String QUERY = "SELECT * FROM cinemas";
        Scanner scan = new Scanner(System.in);
        try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) { //łączy z baza
            showCinemas(con, QUERY);
            System.out.println("What you want to do type: \n e for edit \n d for delete \n x for exit");
            String option = scan.next();
            while (!option.equals("e") & !option.equals("d") & !option.equals("x")) {
                option = scan.next();
            }
            ;
            switch (option) {
                case "e":
                    editCinemas(con);
                    showCinemas(con,QUERY);
                    break;
                case "d":
                    deleteCinema(con);
                    break;
                case "x":
                    System.out.println("Bye Bye");
                    break;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public static void deleteCinema(Connection con) throws SQLException{
        String QUERY = "DELETE from cinemas WHERE id = ?";
        System.out.println("Please give ID cinema to delete");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Are you sure to delete? \n y for yes\n n for no");
        String decision = sc.nextLine();
        if(decision.equals("y")){
            PreparedStatement preStmt = con.prepareStatement(QUERY);
            preStmt.setInt(1,id);
            preStmt.executeUpdate();
        } else{
            System.out.println("Bye Bye ");
        }

    }
    public static void editCinemas(Connection con) throws SQLException{
        String QUERY = "UPDATE cinemas SET name = ? , address = ? WHERE id = ?  ";
        System.out.println("Please give ID cinema to Edit");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Please give new name");
        String name = sc.nextLine();
        System.out.println("Please give new address");
        String address = sc.nextLine();
        PreparedStatement preStmt = con.prepareStatement(QUERY);
        preStmt.setString(1,name);
        preStmt.setString(2,address);
        preStmt.setInt(3,id);
        preStmt.executeUpdate();
    }
    public static void showCinemas(Connection con, String QUERY) throws SQLException {
        Statement stmt = con.createStatement();
        ResultSet results = stmt.executeQuery(QUERY);  //executeQuery() zwraca ResultsSet który ma wynik, executeUpdate() - wraca int jako liczba zmodyfikowanych wierszy
        while (results.next()) {
            int id = results.getInt("id");
            String name = results.getString("name");
            String address = results.getString("address");
            System.out.println(id + " " + name + " " + address);
        }
    }
}
