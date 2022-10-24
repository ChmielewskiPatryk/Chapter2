import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//napisz program, który wczyta dane z pliku people.csv.
//Za pomocą wyrażeń regularnych sprawdź czy wiersz zawiera poprawny zestaw danych, tzn.:
//email,imię,nazwisko,wiek,miasto
//Sprawdź:
//poprawność adresu email,
//czy imię, nazwisko oraz miasto zawierają tylko litery,
//czy wiek jest wartością liczbową.
//Pierwsze 6 wierszy zawiera błędne dane.
//Utwórz klasę Person zawierającą pola:
//private  String firstName;
//private  String lastName;
//private  Integer age;
//private  String city;
//Utwórz listę i - jeżeli dane są poprawne - z każdego wiersza utwórz obiekt klasy Person, a następnie umieść go na liście.
public class Main3 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Map<Integer, List<Person>> peopleByAge = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("people.csv"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 5 && checkData(data)) {
                    Person person = createPerson(data);
                    people.add(person);
                } else {
                    System.out.println("Wrong data");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        peopleByAge = groupByAge(people, peopleByAge);
        for(Map.Entry<Integer,List<Person>> entry : peopleByAge.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().toString());
        }
    }

    public static Map<Integer, List<Person>> groupByAge(List<Person> people, Map<Integer, List<Person>> peopleByAge) {
        for (Person person : people) {
            if (peopleByAge.containsKey(person.age)) {
                List<Person> tempPerson = peopleByAge.get(person.age);
                tempPerson.add(person);
                peopleByAge.put(person.age, tempPerson);
            }else{
                List<Person> tempPerson = new ArrayList<>();
                tempPerson.add(person);
                peopleByAge.put(person.age, tempPerson);
            }
        }
        return peopleByAge;
    }

    public static boolean checkData(String[] data) {
        String emailRegex = "[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}";
        String onlyLettersRegex = "[a-zA-z]+";
        String numberRegex = "[0-9]+";
        boolean checkEmail = data[0].matches(emailRegex);
        boolean checkName = data[1].matches(onlyLettersRegex);
        boolean checkSurname = data[2].matches(onlyLettersRegex);
        boolean checkAge = data[3].matches(numberRegex);
        boolean checkCity = data[4].matches(onlyLettersRegex);
        return checkEmail && checkName && checkSurname && checkAge && checkCity;
        //            String name = data[1];
//            String surname = data[2];
//            Integer age = Integer.parseInt(data[3]);
//            String city = data[4];
//            Person newPerson = new Person(name, surname, age, city);
//            return newPerson;
    }

    public static Person createPerson(String[] data) {
        return new Person(data[1], data[2], Integer.parseInt(data[3]), data[4]);
    }
}

