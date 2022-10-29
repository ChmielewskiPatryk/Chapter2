import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //W metodzie main utwórz listę o nazwie elements przechowującą elementy typu Integer.
        //Dodaj do kolekcji 10 elementów od 10 do 19.
        //Wypisz elementy na konsoli używając pętli for.
        //Wypisz elementy na konsoli używając iteratora i pętli while.
        //Wypisz na konsoli elementy używając iteratora i pętli for.
        //Wypisz na konsoli elementy używając konstrukcji for-each.
        List<Integer> elements = new ArrayList<>();
        for (int i = 10; i < 20; i++) {
            elements.add(i);
        }
        System.out.println("-------1--------");
        for (int i = 0; i < elements.size(); i++) {
//            System.out.println(elements.get(i));
        }
        removeDivider(elements, 7);

        System.out.println("-------2--------");
        Iterator<Integer> iterator = elements.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        System.out.println("-------3--------");
//        for (Iterator<Integer> iterator2 = elements.iterator(); iterator2.hasNext(); ) {
//            System.out.println(iterator2.next());
//        }
//        System.out.println("-------4-------");
//        for (int i : elements) {
//            System.out.println(i);
//        }
//

    }
// napisz metodę public static void removeDivider (List<Integer> list, int divider), która usunie z listy wszystkie elementy podzielne przez divider
    public static void removeDivider(List<Integer> list, int divider) {
        System.out.println(divider);
        Iterator<Integer> i = list.iterator();
        while (i.hasNext()){
            if(i.next()%divider == 0){
                i.remove();
            }
        }
//        for (int i=0; i < list.size(); i++) {
//            if (list.get(i) % divider == 0) {
//                list.remove(list.get(i));
//            }
//        }
    }
}