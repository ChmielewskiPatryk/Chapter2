import java.util.*;

//Napisz metodę public static Map<String, String> getMap(), która utworzy 5 dowolnych zestawów przeciwieństw (np. ciepło - zimno), doda je do mapy, a następnie zwróci.
//W metodzie main programu, dla każdego klucza mapy, pobieraj z konsoli odpowiedź użytkownika.
//Program ma zadać 5 pytań.
//Po udzieleniu ostatniej odpowiedzi - ma wyświetlić wynik w postaci Poprawnych odpowiedzi: 3;
public class Main4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String,String> map = getMap();
        int counter = 0;
        System.out.println("Podaj przeciwieństwo: ");
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key);
            String str = sc.nextLine();
            if(str.equals(map.get(key))){
                counter++;
            }
        }
        System.out.println(counter);

    }
    public static Map<String, String> getMap(){
        Map<String,String> map = new HashMap<>();
        map.put("cieplo","zimno");
        map.put("jasno","ciemno");
        map.put("gruby","chudy");
        map.put("duzy","maly");
        map.put("szybko","wolno");
        return map;
    }
}
