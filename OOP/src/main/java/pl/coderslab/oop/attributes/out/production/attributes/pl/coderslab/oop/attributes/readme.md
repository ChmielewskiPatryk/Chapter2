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

## Zadanie 1 - rozwiązywane z wykładowcą

Utwórz klasę `AccessModifier` dodaj w niej atrybuty:

1. atrybut o nazwie `publicAttribute` z modyfikatorem `public`,
2. atrybut o nazwie `privateAttribute` z modyfikatorem `private`,
3. atrybut o nazwie `protectedAttribute` z modyfikatorem `protected`.

W pliku `Main01.java` umieść w metodzie `main` kod, który:

1. Utworzy obiekt klasy `AccessModifier` i przypisze go do zmiennej `testAttribute`.
2. Sprawdź które z atrybutów klasy `AccessModifier` są dostępne. 


## Zadanie 2

W pliku `Main02.java`, w metodzie `main`, utwórz obiekt klasy `AccessModifier` o nazwie `testAttribute`,  
a następnie ustaw i wyświetl wszystkie wartości, które są możliwe do ustawienia. 


## Zadanie 3

Utwórz klasę `Person`, dodaj w niej atrybuty:
- name,
- surname,
- age,
- gender (typu `char`).

Wszystkie atrybuty mają być publiczne i mają mieć ustawione wartości domyślne.

W pliku `Main03.java`, w metodzie `main`, utwórz obiekt klasy `Person` o nazwie `person`,  
a następnie wyświetl kolejno atrybuty klasy (name, surname, age, gender).

---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
