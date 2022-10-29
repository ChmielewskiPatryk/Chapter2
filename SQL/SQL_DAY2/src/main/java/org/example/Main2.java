package org.example;

public class Main2 {
    //połącz tabele cinemas i movies relacją wiele do wielu (film może być wyświetlany w wielu kinach, kino może mieć wiele filmów).
    //Utworzoną tabelę nazwij cinemas_movies (tabela będzie reprezentowała repertuar w danym kinie),
    //uzupełnij tabelę kilkoma wpisami.
    public String QUERY1 = "CREATE TABLE cinemas_movies(id int AUTO_INCREMENT, cinema_id int NOT NULL, movie_id int NOT NULL, PRIMARY KEY(id), FOREIGN KEY(cinema_id) REFERENCES cinemas(id), FOREIGN KEY(movie_id) REFERENCES movies(id));";
    public String QUERY2 = "INSERT INTO cinemas_movies(cinema_id, movie_id) VALUES (1,2),(1,2),(1,3),(1,5),(2,2),(2,5),(3,1),(3,2),(3,5);";
    //Wszystkie bilety które zostały opłacone gotówką (czyli type = cash).
    //Wszystkie bilety które nie zostały jeszcze opłacone.
    public String QUERY3 = "SELECT * FROM tickets JOIN payments ON tickets.id = payments.ticket_id and payments.type = 'cash';";
    public String QUERY4 = "SELECT * FROM tickets JOIN payments ON tickets.id = payments.ticket_id and payments.status = 0;";
    //kina, w którym wyświetlany jest film o id równym 1,
    //filmy wyświetlane w kinie o id równym 1.
    public String QUERY5 = "SELECT name from cinemas_movies as cm JOIN cinemas as c ON cm.cinema_id = c.id JOIN movies as m ON cm.movie_id = m.id WHERE m.id = 1;";
    public String QUERY6 = "SELECT title from cinemas_movies as cm JOIN cinemas as c ON cm.cinema_id = c.id JOIN movies as m ON cm.movie_id = m.id WHERE c.id = 1;";
}
