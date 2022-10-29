import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Napisz program który w metodzie main będzie w pętli pobierał z konsoli napisy, do momentu podania exit.
//Pobrane od użytkownika napisy dodawaj do kolekcji typu Set.
//Utwórz zmienną typu int o nazwie count i wartości początkowej 0.
//Po pobraniu napisu zwiększaj wartość zmiennej count.
//Testując program podaj kilkukrotnie ten sam napis.
//Po wpisaniu exit wypisz na konsoli: Podanych napisów: [liczba napisów], Rozmiar kolekcji: [liczba elementów w kolekcji]
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> myhashSet = new HashSet<>();
        int count = 0;
        while(sc.hasNext()){
            String str = sc.nextLine();
            if(str.equals("exit")){
                break;
            }
            count++;
            myhashSet.add(str);
            System.out.println(str);
        }
        System.out.println("Liczba napisów: "+count+" Rozmiar kolekcji: "+myhashSet.size());

    }
}