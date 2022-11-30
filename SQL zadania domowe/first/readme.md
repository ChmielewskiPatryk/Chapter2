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

## Zadanie 1

#### Przygotowanie i informacje
W pliku `dump.sql` znajduje się przygotowany zrzut dwóch tabel z bazy danych, wypełniony już gotowymi danymi, na których będziesz pracować – zaimportuj go do swojej bazy.
Zwróć uwagę, że daty są generowane losowo, więc nie wszystkie zapytania będą zwracać wartości, w takim przypadku możesz ręcznie zmodyfikować dane w bazie.

Struktura oraz znaczenie poszczególnych kolumn w tabeli:  

Tabela `users`:
* `id` – id użytkownika
* `name` – nazwa użytkownika
* `email` – mail użytkownika
* `password` – hasło użytkownika (hash sha-256)
* `salt` – "sól" użyta do generowania hasła użytkownika

Tabela `offers`:
* `id` – id oferty
* `owner` – id użytkownika, relacja z tabelą `users`
* `status` – status oferty – 0 – weryfikacja, 1 – aktywne, 2 – odrzucone
* `price` – cena oferty
* `promoted` – 0/1 – czy oferta jest promowana
* `title` – tytuł oferty
* `description` – opis oferty
* `phone` – telefon do oferty
* `expire` – czas wygaśnięcia oferty – jeśli w przeszłości, oferta nieaktywna
* `promoted_to` – czas promowania oferty – jeśli w przeszłości oferta nie promowana
* `activation_token` – token do aktywacji oferty


W pliku `Main01.java` są przygotowane zmienne, zapisz do nich zapytania `SQL`, które:

1. zwrócą użytkowników, których imię to `Julia`,
2. zwrócą listę 5 użytkowników, po posortowaniu malejąco po kolumnie `email`,
3. zwrócą listę użytkowników, których email jest w domenie `@yahoo.com` oraz imię rozpoczyna się na `L`,
4. zwrócą listę użytkowników, których `SHA2(name + salt, 256)` jest zgodne z kolumną `password` –> hint [SHA2()][mysql_sha2], [CONCAT()][mysql_concat],
5. zwrócą listę **id** i **tytułów** ofert z ceną większą niż `500 000`,
6. zwrócą listę **id** i **cenę** ofert, które nie posiadają tokena aktywacyjnego oraz posiadają cenę pomiędzy `2 000` a `400 000` –> hint [BETWEEN()][mysql_between],
7. zwrócą listę **tytuł**, **cena** i **telefon** ofert, które kończą się w ciągu `10` dni i są aktywne (**których data ważności jest większa niż aktualny czas**) –> hint [DATE_ADD()][mysql_date_add], [CURRENT_TIMESTAMP()][mysql_current_timestamp], [FROM_UNIXTIME()][mysql_from_unixtime],
8. zwrócą listę ofert, których opis zawiera `violent`, telefon zawiera cyfrę `2` i cena jest wyższa niż `50 000`,
9. zwrócą listę ofert, które **nie są** promowane a ich cena jest mniejsza niż `300 000` oraz tytuł **kończy się** na `LLC`,
10. zwrócą oferty, których cena pomnożona przez `2` jest mniejsza od `50 000` oraz oferta jest promowana (**data końca promowania jest w przyszłości**),
11. zwrócą liczbę aktywnych (**których data ważności jest większa niż aktualny czas** i mają odpowiedni status) ofert, jako alias `sum_active` –> hint [COUNT()][mysql_count];

    ```
    Przykład
    +------------+
    | sum_active |
    +------------+
    |         59 |
    +------------+
    ```

12. **dodatkowe**  
    zwrócą liczbę aktywnych (**których data ważności jest większa niż aktualny czas** i mają odpowiedni status) ofert, jako alias `sum_user`, posiadanych przez użytkownika, zwrócona lista ma zawierać wszystkich użytkowników –> hint `GROUP BY`, `WHERE`, `COUNT()`,

    ```
    Przykład
    +-------+----------+
    | owner | sum_user |
    +-------+----------+
    |     2 |        9 |
    |     3 |       21 |
    |     5 |        1 |
    |    10 |        1 |
    |   ... |      ... |
    |    13 |        2 |
    +-------|----------|
    ```

13. **dodatkowe**  
    zwrócą liczbę ofert **tylko aktywnych i odrzuconych**, jako kolumny `type` oraz `counter` (powinno zwrócić 2 rekordy),  
    
    ```
    Przykład
    +------+---------+
    | type | counter |
    +------+---------+
    |    1 |      14 |
    |    2 |      42 |
    +------+---------+
    ```

14. **dodatkowe**  
    zwrócą **sumę** cen ofert nieaktywnych (**których czas ważności minął**, a które były aktywne i posiadały `status=1`), jako alias `sum_nonactive_nopromoted`, które nie były promowane –> hint [SUM()][mysql_sum],
15. **dodatkowe**  
    zwrócą średnią cenę ofert jako `avg_price`, zaokrąglone do **dwóch** miejsc po przecinku, biorąc pod uwagę oferty aktywne (**których data ważności jest późniejsza niż aktualny czas**) i **promowane** z ceną ponad `44 645.04` –> hint [AVG()][mysql_avg], [ROUND()][mysql_round].

    ```
    Przykład
    +-----------+
    | avg_price |
    +-----------+
    | 523168.97 |
    +-----------+
    ```

## Zadanie 2

W pliku `Main02.java` zapisz do odpowiednich zmiennych zapytania tworzące tabele.  

W bazie danych stwórz następujące tabele:

```SQL
* images:
  * id: int unsigned auto_increment primary key
  * offer_id: int unsigned
  * src: varchar(100) (link do zdjęcia)
  * dimension: varchar(10) (np. 400x832)
* users_companies:
  * id: int unsigned auto_increment primary key
  * user_id: int unsigned unique
  * name: varchar(30)
  * nip: int
  * street: varchar(50)
  * street_nr: mediumint
  * phone: char(9)
  * post_code: char(6)
  * capital: decimal(7,2)
  * rate: decimal(5,4)
  * created_at: datetime
```

## Zadanie 3

W pliku `Main03.java` napisz zapytania dodające po 5 rekordów do każdej z tabel, utworzonych w poprzednim zadaniu.  

---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
