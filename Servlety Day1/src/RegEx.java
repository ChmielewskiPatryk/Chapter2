//1
//Napisz metodę static boolean verifyEmail(String email), która zwróci true jeżeli podany parametr jest poprawnym adresem email, false w przeciwnym wypadku.
//Wykorzystaj wyrażenia regularne.
//2
//Napisz metodę static boolean verifyPassword(String password), która zwróci true jeżeli ciąg znaków:
//Ma od 10 do 15 znaków.
//Ma minimum jedną małą literę.
//Ma minimum jedną wielką literę.
//Nie zawiera dwóch wielkich lub dwóch małych liter z rzędu.
//false w przeciwnym wypadku.
//
//Wykorzystaj wyrażenia regularne. Warunki możesz sprawdzać oddzielnie.


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args){
        System.out.println(verifyPassword("dA1223DDsS!"));

    }
    static boolean verifyEmail(String email){
        Pattern compiledPatter = Pattern.compile("[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}");
        Matcher matcher = compiledPatter.matcher(email);
        return matcher.matches();

    }
    static boolean verifyPassword(String password){
        Pattern cp = Pattern.compile("^(?!.*[a-z]{2})(?!.*[A-Z]{2})(?=.*[a-z])(?=.*[A-Z]).{10,15}$");
        Matcher matcher = cp.matcher(password);
        return matcher.matches();

    }
}
