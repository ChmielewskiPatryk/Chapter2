import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main3 {
    public static void main(String[] args) {
        List<City> cities = initialize();
//        for (City city : cities) {
//            System.out.println(city.name);
//        }
//        List<City> citiesPart = firstSubList(cities,2,3);
//        List<City> citiesPart = secondSubList(cities,2,3);
        List<City> citiesPart = reverse(cities);
        for (City city : citiesPart) {
            System.out.println(city.name);
        }
    }

    public static List<City> initialize() {
        City poznan = new City("Poznan", 500000);
        City wroclaw = new City("Wroclaw", 600000);
        City warszawa = new City("Warszawa", 1000000);
        City katowice = new City("Katowice", 800000);
        City rzeszow = new City("Rzeszow", 200000);
        List<City> cities = new ArrayList<>();
        cities.add(poznan);
        cities.add(wroclaw);
        cities.add(warszawa);
        cities.add(katowice);
        cities.add(rzeszow);
        return cities;
    }

    public static List<City> firstSubList(List<City> list, int start, int end) {
        List<City> subList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i >= start & i <= end) {
                subList.add(list.get(i));
            }

        }
        return subList;
    }

    public static List<City> secondSubList(List<City> list, int start, int end) {
        return list.subList(start, end);
    }
//Napisz metodę public static List<City> reverse (List<City> list ), która zwróci listę elementów w odwrotnej do otrzymanej kolejności.
//Zapoznaj się z możliwościami klasy ListIterator.
    public static List<City> reverse(List<City> list) {
        List<City> reversed = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            reversed.add(list.get(list.size() - i-1));
        }
        return reversed;
    }

}
