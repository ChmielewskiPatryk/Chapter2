import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

//pobierz z konsoli od użytkownika identyfikator filmu
        //usuń wiersz na podstawie pobranego identyfikatora.
public class Main4 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Give cinemae id to remove");
    int id = scan.nextInt();
    Connection conn = null;
    try{
      conn = DbUtil.connect();
      DbUtil.remove(conn,"cinema",id);
    }catch (SQLException e){
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
