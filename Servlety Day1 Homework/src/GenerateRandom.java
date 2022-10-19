import java.util.HashMap;
import java.util.Map;
import java.util.Random;
//utwórz klasę GenerateRandom zawierającą metodę o sygnaturze: public static Map<Integer, Integer> checkRand(int amount, int interval), metoda ta ma zwracać mapę wystąpień wartości losowych generowanych za pomocą klasy Random.
//
//Kluczem mapy ma być losowana liczba, wartością ilość jej wystąpień.
//
//Parametry:
//
//amount - oznaczają ilość losowań, jaka ma być wykonana.
//interval - zakres wartości dla metody klasy nextInt klasy Random.
//Przykładowy wynik wyświetlenia elementów mapy dla wywołania metody z parametrami amount = 500000 oraz interval = 10:
//
//0 : 50082
//1 : 49956
//2 : 49771
//3 : 50001
//4 : 50036
//5 : 49699
//6 : 50082
//7 : 50272
//8 : 50094
//9 : 50007
//
//
//Przetestuj działanie metody w klasie Main01.
public class GenerateRandom {
    public static Map<Integer, Integer> checkRand(int amount, int interval) {
        Map<Integer, Integer> mapRand = new HashMap<>();
        for(int i =0; i< interval;i++){
            mapRand.put(i,0);
        }
        Random rand = new Random();
        for (int i =0;i<amount;i++){
            int randKey = rand.nextInt(interval);
            int randValue = mapRand.get(randKey);
            mapRand.put(randKey,randValue+1);
        }
        for(int i =0; i< interval;i++){
            System.out.println(i+": "+mapRand.get(i));
        }

        return mapRand;
    }
}
