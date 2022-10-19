import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//napisz program, który wczyta dane z pliku people.csv.
//
//Za pomocą wyrażeń regularnych sprawdź czy wiersz zawiera poprawny zestaw danych, tzn.:
//
//email,imię,nazwisko,wiek,miasto
//
//Sprawdź:
//
//poprawność adresu email,
//
//czy imię, nazwisko oraz miasto zawierają tylko litery,
//
//czy wiek jest wartością liczbową.
//
//Pierwsze 6 wierszy zawiera błędne dane.
//
//Utwórz klasę Person zawierającą pola:
//private  String firstName;
//private  String lastName;
//private  Integer age;
//private  String city;
//
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
                if (data.length == 5) {
                    Person person = checkData(data);
                    people.add(person);
                } else {
                    System.out.println("Wrong data");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println(people.size());
        groupByAge(people);
    }

    public static void groupByAge(List<Person> people) {
        Set<Integer> ageSet = new HashSet<>();
        for (Person person : people) {
            if (person != null) {
                ageSet.add(person.age);
            }
        }
        for(int age : ageSet){

        }
        System.out.println(ageSet.size());
    }

    public static Person checkData(String[] data) {
        String emailRegex = "[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}";
        String onlyLettersRegex = "[a-zA-z]+";
        String numberRegex = "[0-9]+";
        boolean checkEmail = data[0].matches(emailRegex);
        boolean checkName = data[1].matches(onlyLettersRegex);
        boolean checkSurname = data[2].matches(onlyLettersRegex);
        boolean checkAge = data[3].matches(numberRegex);
        boolean checkCity = data[4].matches(onlyLettersRegex);

        if (checkEmail && checkName && checkSurname && checkAge && checkCity) {
            String name = data[1];
            String surname = data[2];
            Integer age = Integer.parseInt(data[3]);
            String city = data[4];
            Person newPerson = new Person(name, surname, age, city);
            return newPerson;
        } else {
            System.out.println("Did not pass regex");
        }
        return null;
    }
}
