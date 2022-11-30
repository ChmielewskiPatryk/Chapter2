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


W bazie danych o nazwie ```products_ex``` stwórz następującą tabelę:
```SQL
* opinions:
  * description: string
```

1. Tabela ```opinions``` ma być połączona z tabelą ```products``` relacją jeden do wielu (produkt ma wiele opinii, opinia jest przypisana do jednego produktu).
2. Napisz po **5** zapytań, które dodadzą opinie do **3** istniejących produktów.  

Zapytania zapisz do przygotowanego pliku `Main1.java`.


## Zadanie 2

W pliku `Main2.java` zapisz do przygotowanych zmiennych odpowiednie zapytania.

W bazie danych o nazwie ```products_ex``` stwórz następujące tabele:
```SQL
* categories:
  * id: int
  * name: string
* categories_sub:
  * id: int
  * main_id: int -- relacja z id głównej kategorii
  * name: string
```
Połącz tabele `categories` i `categories_sub` za pomocą relacji wiele do jednego 
(jedna kategoria może mieć wiele podkategorii, jedna podkategoria ma jedną kategorię nadrzędną).


---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
