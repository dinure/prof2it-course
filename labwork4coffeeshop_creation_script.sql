create database coffeeshop;
use coffeeshop;
create table coffee(
	id bigint not null auto_increment,
	price numeric(38,2),
	sort tinyint,
	weight numeric(38,2),
	primary key (id)
);
create table customers(
	id bigint not null auto_increment,
	address varchar(255),
	email varchar(255),
	name varchar(255),
	phone varchar(255),
	primary key (id)
);
create table purchaseorders(
	id bigint not null auto_increment,
	delivery_date date,
	placement_date date,
	status tinyint,
	total_price numeric(38,2),
	coffee_id bigint,
	customer_id bigint,
	primary key (id),
	foreign key (coffee_id) references coffee(id),
	foreign key (customer_id) references customers(id)
);
insert into coffee (price, sort, weight) values (1.35, 1, 0.46);
insert into customers (address, email, name, phone) values ('Earth', 'jd@mail.com', 'John Doe', '+123456789123');
insert into purchaseorders (delivery_date, placement_date, status, total_price, coffee_id, customer_id) values ('2024-10-29', '2024-10-21', 1, 1.35, 1, 1);
select * from purchaseorders 
join coffee on coffee_id=coffee.id
join customers on customer_id=customers.id;