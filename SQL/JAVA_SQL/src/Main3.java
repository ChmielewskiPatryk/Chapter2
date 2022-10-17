import java.sql.Connection;
import java.sql.SQLException;

//napisz program, który wyświetli na konsoli wszystkie filmy znajdujące się w bazie danych o nazwie cinemas_ex,
//w metodzie main programu wywołaj zapytania, wykorzystując metodę printData klasy DbUtil.
public class Main3 {
    public static void main(String[] args){


        Connection conn = null;
        String QUERY = "SELECT * from cinema";
        String colName1 = "name";
        try {
            conn = DbUtil.connect();
            DbUtil.printData(conn,QUERY, colName1);
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


