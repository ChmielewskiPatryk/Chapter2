use cinemas_ex;
create table cinemas_movies(
id int auto_increment,
cinema_id int not null,
movie_id int not null,
primary key(id),
foreign key(cinema_id) references cinemas(id),
foreign key(movie_id) references movies(id));

insert into cinemas_movies(cinema_id, movie_id) values
(6,1),(6,2),(7,3),(7,6),(8,1),(8,5),(9,3),(9,5),(10,2),(10,6);

select * from movies
join cinemas_movies on movies.id = cinemas_movies.movie_id
join cinemas on cinemas.id = cinemas_movies.cinema_id;