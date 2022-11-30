alter table movies add watchCount int;
alter table movies add isTop tinyint default 0;
alter table cinemas add openTime time;
alter table cinemas add closeTime time;
