use cinemas_ex;

select * from tickets 
join payments on tickets.id = payments.ticket_id where payments.type = 'cash';

select * from tickets 
join payments on tickets.id = payments.ticket_id where tickets.status = 0;