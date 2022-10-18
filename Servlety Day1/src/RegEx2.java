import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

////3
////Napisz program, który będzie przyjmował linie z konsoli, do momentu wpisania quit.
////Przy pomocy metody replaceAll usuń z podanego wyrażenia znaki białe (np. spacje).
////Program ma sprawdzać czy wpisany napis jest poprawnym działaniem matematycznym, np:
////2+3 - 1 = 4
////2 + 2 =4
////1+ 1 =2
////3-1 + 2 =122
////2 * 4- 2 = 6
////6 / 3 + 10 = 12
////
////Możesz dokończyć wyrażenie :
////
////private static final String REGEX = "(\\d[\\/*])*\\d=";
////
////Jeżeli wyrażenie jest poprawny działaniem matematycznym zapisz je do pliku o nazwie operations.txt.
////Pomijamy sprawdzanie poprawności wyniku, istotna jest poprawność składniowa.
public class RegEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Path path = Paths.get("/Users/imac/Desktop/Chapter2/Chapter2/Servlety Day1/operations.txt");
        List<String> list = new ArrayList<>();
        List<String> listSorted = new ArrayList<>();
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (str.equals("exit")) {
                break;
            }
            list.add(str);
        }
        for (String eq : list) {
            eq = eq.replaceAll("\\s+", "");
            Pattern pt = Pattern.compile("^(\\d+[\\/\\*\\+\\-])+\\d+=\\d+$");
            Matcher m = pt.matcher(eq);
            if (m.matches()) {
                System.out.println(eq);
                listSorted.add(eq);
            }
        }
        try{
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
            Files.write(path,listSorted);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
