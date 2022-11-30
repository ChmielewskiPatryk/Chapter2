use cinemas_ex;
select name from cinemas join 
cinemas_movies on cinemas.id = cinemas_movies.cinema_id 
where cinemas_movies.movie_id = 1;

select title from movies join
cinemas_movies on movies.id = cinemas_movies.movie_id 
where cinemas_movies.cinema_id = 6;
--6 to taki odpowiednik 1 bo pojebałem wcześniej--  