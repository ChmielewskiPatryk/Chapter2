import java.util.*;

//Utwórz klasę Country, dodaj w niej atrybuty:
//
//name (String)
//capital (String)
//Następnie w pliku Main03.java:
//
//Napisz metodę public static List<Country> initialize (), która utworzy 5 obiektów klasy Country, doda je do listy, którą następnie zwróci.
//Napisz metodę public static Map<String, Country> getMap (List<Country> list), która utworzy, a następnie zwróci mapę, gdzie kluczem będzie nazwa stolicy pobrana z obiektu country, a wartością referencja do obiektu country:
//W metodzie main wyświetl informacje w postaci:
//Berlin - Niemcy
//Warszawa - Polska
public class Main5 {
    public static void main(String[] args) {
        List<Country> countries = initialize();
        Map<String, Country> myMap = getMap(countries);
        Set<String> keys = myMap.keySet();
        for (String key : keys) {
            System.out.println(key+" - "+myMap.get(key).name);
        }

    }

    public static Map<String, Country> getMap(List<Country> list) {
        Map<String, Country> myMap = new HashMap<>();
        for (Country c : list) {
            myMap.put(c.capital, c);
        }
        return myMap;
    }

    public static List<Country> initialize() {
        List<Country> countries = new ArrayList<>();
        Country polska = new Country("Polska", "Warszawa");
        Country niemcy = new Country("Niemcy", "Berlin");
        Country francja = new Country("Francja", "Paryz");
        Country hiszpania = new Country("Hiszpania", "Madryt");
        Country portugalia = new Country("Portugalia", "Lizbona");
        countries.add(polska);
        countries.add(niemcy);
        countries.add(francja);
        countries.add(hiszpania);
        countries.add(portugalia);
        return countries;
    }

}
