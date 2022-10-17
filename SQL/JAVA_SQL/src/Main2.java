

//W pliku Main03.java stwórz metodę o sygnaturze static void addCinema(String name, String address).
//
//Uzupełnij ciało metody tak, aby podane parametry zapisała do tabeli cinemas.
//Wykorzystaj metodę insert klasy DbUtil. Pamiętaj o zmianie bazy danych na odpowiednią.
//W metodzie main pobierz z konsoli wymagane parametry, a następnie wywołaj utworzoną metodę
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give name of cinema");
        String name = scan.nextLine();
        System.out.println("Give address of cinema");
        String address = scan.nextLine();
        addCinema(name, address);
    }
    static void addCinema(String name, String address){
        Connection conn = null;
        String QUERY = "INSERT INTO cinema(name,address) VALUES (?,?)";
        try {
            conn = DbUtil.connect();
            DbUtil.insert(conn,QUERY,name,address);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
