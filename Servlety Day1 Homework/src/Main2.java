import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Napisz metodę static boolean verifyLogin(String login), która zwróci true jeżeli ciąg znaków:
//Ma minimum 5 znaków.
//Zawiera tylko litery, cyfry, znak podkreślenia, myślnik.
//Nie zaczyna się od cyfry.
//false w przeciwnym wypadku.
public class Main2 {
    static boolean verifyLogin(String login){
        Pattern pt = Pattern.compile("^[^0-9][a-zA-Z0-9\\_\\-]{5,}");
        Matcher m = pt.matcher(login);
        return m.matches();
    }
}
