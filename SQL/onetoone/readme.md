![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/152855/73064373-5ed69780-3ea1-11ea-8a71-3d370a5e7dd8.png)

# Kilka ważnych informacji

Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki

## Jak zacząć?

1. Stwórz [*fork*](https://guides.github.com/activities/forking/) repozytorium z zadaniami.
2. Sklonuj repozytorium na swój komputer. Użyj do tego komendy `git clone adres_repozytorium`
Adres repozytorium możesz znaleźć na stronie repozytorium po naciśnięciu w guzik "Clone or download".
3. Rozwiąż zadania i skomituj zmiany do swojego repozytorium. Użyj do tego komend `git add nazwa_pliku`.
Jeżeli chcesz dodać wszystkie zmienione pliki użyj `git add .` 
Pamiętaj że kropka na końcu jest ważna!
Następnie skommituj zmiany komendą `git commit -m "nazwa_commita"`
4. Wypchnij zmiany do swojego repozytorium na GitHubie.  Użyj do tego komendy `git push origin master`
5. Stwórz [*pull request*](https://help.github.com/articles/creating-a-pull-request) do oryginalnego repozytorium, gdy skończysz wszystkie zadania.

Poszczególne zadania rozwiązuj w odpowiednich plikach.

# Poniżej znajdziesz wytyczne do zadań

Wszystkie zapytania do bazy wykonuj w **konsoli** lub z wykorzystaniem **IntelliJ**.  
Dodatkowo zapisz treść zapytań do plików ``java``, przygotowanych do każdego zadania.  
 
> **Część zadań ma w poleceniu utworzenie relacji między tabelami – w takiej sytuacji należy zmodyfikować strukturę tabel**
> **i dodać nowe kolumny lub nowe tabele**


## Zadanie 1 - rozwiązywane z wykładowcą


W bazie danych o nazwie ```products_ex``` stwórz następującą tabelę:
```SQL
* client_address:
  * client_id: int
  * city: string
  * street: string
  * house_nr: string
```

Tabela ```client_address``` ma być połączona relacją jeden do jednego z tabelą ```clients```.  
Napisz 5 zapytań SQL, które wprowadzą adresy dla istniejących już użytkowników.

Zapytania SQL zapisz w przygotowanym pliku `Main1.java`.

## Zadanie 2

Jeżeli nie masz bazy danych `cinemas_ex` albo jest ona niekompletna, to usuń ją i stwórz nową bazę danych o nazwie ```cinemas_ex```.  
Następnie zaimportuj do niej dane z pliku **cinema.sql**.
Są to gotowe tabele wypełnione danymi.

## Zadanie 3

Zapytania wykonuj w bazie `cinemas_ex`.  

Tabela `payments` z tabelą `tickets` ma być powiązana relacją jeden do jednego.  
Relacja między biletem a płatnością jest następująca:  

> płatność musi być przypisana do biletu **(dodaj klucz obcy do tabeli `payments`)**

Uzupełnij tabelę `payments` kilkoma wpisami. Przyjmujemy trzy typy płatności: `cash`, `transfer` i `card`.

Zapytania SQL zapisz w przygotowanym pliku `Main3.java`.

---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
