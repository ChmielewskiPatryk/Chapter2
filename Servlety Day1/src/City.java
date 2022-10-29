//Utwórz klasę City, dodaj w niej atrybuty:
//
//name (String)
//population (int)
//Klasa powinna mieć też konstruktor przyjmujący wszystkie 2 parametry
//
//Następnie w pliku Main03.java:
//
//Napisz metodę public static List<City> initialize(), która utworzy 5 obiektów klasy City, doda je do listy, którą następnie zwróci.
//Napisz metodę public static List<City> firstSubList(List<City> list, int start, int end ), która zwróci sublistę elementów listy list o początku start i końcu end. Wykorzystaj dowolną pętlę.
//Napisz metodę public static List<City> secondSubList(List<City> list, int start, int end ), która zwróci sublistę elementów listy list o początku start i końcu end. Wykorzystaj wbudowaną metodę List.subList(int fromIndex, int toIndex).
public class City {
    public String name;
    public int population;

    public City(String _name, int _population){
        this.name = _name;
        this.population = _population;
    }


}
