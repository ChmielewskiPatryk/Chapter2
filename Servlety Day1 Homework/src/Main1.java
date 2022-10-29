// do zmiennych reg1, reg2, reg3, reg4 wpisz kolejno wyrażenia regularne, opisujące:
//
//liczby zmiennoprzecinkowe (5.65 , 123.123)
//liczby w notacji naukowej ( 5.4325e+04 ; 2.0000342E-06)
//datę w formacie dd/mm/yyyy
//datę w formacie yyyy-mm-dd - gdzie rok jest powyżej 2000
public class Main1 {
    public String reg1 ="^\\d+\\.\\d+";
    public String reg2 ="^\\d+\\.\\d+[eE][\\+\\-]\\d+";
    public String reg3 ="^\\d{2}\\/\\d{2}\\/\\d{4}$";
    public String reg4 ="^2\\d{3}\\/\\d{2}\\/\\d{2}$";
}
