alter table tickets add priceUSD decimal(4,2);
alter table movies add director char(80);
alter table movies modify column director varchar(50);
alter table tickets drop column priceUSD;