use cinemas_ex;
delete from movies where id = 4;
delete from cinemas where name = "helios";
update tickets set quantity = 10;
delete from payments where payment < date("2019-01-01");
show variables like "sql_safe_updates";
set sql_safe_updates = 0;