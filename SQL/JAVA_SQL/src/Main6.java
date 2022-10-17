//W pliku Main6.java napisz program, który wyświetli na konsoli listę filmów.
//Lista ma zawierać filmy, których rating jest większy, niż średni rating wszystkich filmów.
//
//HINT Oblicz najpierw średni rating filmów, a następnie pobierz filmy z ratingiem większym niż średni.
//Oblicz średni rating przy pomocy zapytania SQL i funkcji AVG().

import java.sql.*;

public class Main6 {
    public static void main(String[] args){
        String avg = "";
        String QUERY = "select AVG(rating) as avg from movies";
        String QUERY1 = "select * from movies where rating > ? ";
        try(Connection conn = DbUtil.connect()){
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(QUERY);
            while(result.next()){
                avg = result.getString("avg");
                System.out.println(avg);
            }
            PreparedStatement preStmt = conn.prepareStatement(QUERY1);
            preStmt.setString(1,avg);
            ResultSet res = preStmt.executeQuery();
            while(res.next()){
                System.out.println(res.getString("title"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

    }}
