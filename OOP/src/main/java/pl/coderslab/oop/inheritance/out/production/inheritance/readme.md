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

Stwórz klasę ```AdvancedCalculator```, która dziedziczy po klasie ```Calculator```.
Klasa powinna implementować następujące metody:

1. ```pow(num1, num2)``` &ndash; metoda ma zwracać ```num1``` do potęgi ```num2```. 
Dodatkowo w tablicy operacji ma zapamiętać napis: "```num1```^```num2``` equals ```result```".
2. ```root(num1, num2)``` &ndash; metoda ma wyliczyć pierwiastek ```num2``` stopnia z ```num1```. 
Dodatkowo w tablicy operacji ma zapamiętać napis: "```num2``` root of ```num1``` equals ```result```".  

## Zadanie 2

Stwórz klasę `Shape`, która będzie posiadała:

1. prywatne atrybuty `x` i `y` (określające środek tego kształtu) oraz `color`,
2. konstruktor, przyjmujący zmienne określające wartości `x`, `y` i `color`, 
3. metodę o nazwie `getDescription()`, wypisującą informacje o tym kształcie, zwracającą wartość typu `String`,
4. metodę o nazwie `getDistance(Shape shape)`, zwracającą odległość od środka innego kształtu, wynik ma być typu `double`.

Sprawdź, co się dzieje, kiedy zmieniasz dostęp do poszczególnych funkcji z publicznego na prywatny.  

## Zadanie 3

Stwórz klasę `Circle`, która spełnia następujące wymogi:

1. dziedziczy po klasie definiującej kształt (`Shape`),
2. ma dodatkowy atrybut `radius`,
3. posiada konstruktor, przyjmujący zmienne określające wartości `x`, `y`, `color` i `radius`,
4. nadpisuje metodę kształtu – `getDescription()`,
5. ma metodę o nazwie `getArea()`, zwracającą pole powierzchni typu `double`,
6. posiada metodę o nazwie `getCircuit()`, zwracającą obwód typu `double`.

Przetestuj metodę `getDistance(Shape shape)` na obiektach typu `Circle`.

## Zadanie 4

Stwórz klasę `Employee`, która posiada:

1. publiczne atrybuty:
 * `id` – atrybut zawierający informację o numerze identyfikacyjnym pracownika,
 * `firstName` – atrybut określający imię pracownika,
 * `lastName` – atrybut określający nazwisko pracownika,
 * `wage` – atrybut określający stawkę godzinową pracownika,
2. konstruktor przyjmujący: id, imię, nazwisko i stawkę za godzinę,
3. metodę `raiseWage(percent)`, której rolą będzie zwiększenie wartości atrybutu `wage` o podany procent.  
Pamiętaj o sprawdzeniu czy podana wartość jest większa lub równa 0.

## Zadanie 5

Stwórz klasę `HourlyEmployee`, reprezentującą pracownika, któremu pracodawca płaci za godziny.
Klasa ma spełniać następujące wymogi:

1. ma dziedziczyć po klasie `Employee`,
2. posiadać dodatkową metodę `calculatePayment(hours)`, która będzie zwracała kwotę do wypłacenia pracownikowi za liczbę wypracowanych godzin. 

## Zadanie 6

Stwórz klasę `SalariedEmployee` reprezentującą pracownika, z którym pracodawca ma umowę miesięczną.
Klasa powinna:

1. dziedziczyć po klasie `Employee`,
2. mieć dodatkową metodę `calculatePayment()`, która będzie zwracała kwotę do wypłacenia pracownikowi za miesiąc
 (dla uproszczenia możemy założyć, że w każdym miesiącu jest 190 godzin pracujących – użyj `final static`). 

---

Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.
