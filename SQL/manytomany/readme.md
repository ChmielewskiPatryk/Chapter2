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
 
>**Część zadań ma w poleceniu utworzenie relacji między tabelami – w takiej sytuacji należy zmodyfikować strukturę tabel**
>**i dodać nowe kolumny lub nowe tabele.**  
 

## Zadanie 1 - rozwiązywane z wykładowcą

Zapytania wykonuj w bazie `products_ex`.  

W pliku `Main1.java`:
1. połącz tabele ```products``` i ```orders``` relacją wiele do wielu,  
2. nową tabelę nazwij `products_orders`,  
3. uzupełnij tabelę kilkoma wpisami.

## Zadanie 2

Zapytania wykonuj w bazie `cinemas_ex`.  

W pliku `Main2.java`:
1. połącz tabele `cinemas` i `movies` relacją wiele do wielu
 (film może być wyświetlany w wielu kinach, kino może mieć wiele filmów).  
 
 Utworzoną tabelę nazwij `cinemas_movies` (tabela będzie reprezentowała repertuar w danym kinie),
2. uzupełnij tabelę kilkoma wpisami.

---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
