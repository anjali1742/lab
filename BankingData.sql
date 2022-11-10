create database banking1

use banking1

create table bankmaster2(acno int,cname varchar(30) not null,city varchar(40) default 'hyd',balance int not null,branchcode int,primary key(acno),foreign key(branchcode) references branchs2(branchcode),check(balance>=500))

desc bankmaster2

insert into bankmaster2 values(10,'siva','chennai',15000,101),(11,'hari','madurai',16000,102),(12,'sai','villupuram',17000,103),(13,'vijay','guindy',18000,104),(14,'shakil','paris',19000,101)
 
select * from bankmaster2

select cname from bankmaster2 where cname like '----%'

update bankmaster2 set balance=35000 where acno=11




create table branchs2(branchcode int primary key ,location varchar(30) not null)

desc branchs2

insert into branchs2 values(106,'annanagar'),(105,'jjnagar'),(102,'kananagar'),(103,'kamnagar'),(104,'westnagar')

select * from  branchs2



create table banktransactions(acno int,Ttype char(1),Tdate datetime not null,amt int not null,foreign key(acno)references bankmaster2(acno))

desc banktransactions


insert into banktransactions values(10,'w','2022-05-10',12000),(11,'w','2022-06-17',17000),(12,'d','2022-05-29',19000),(11,'w','2022-07-18',16000),(13,'d','2022-04-10',18000)

select * from banktransactions
 


select * from bankmaster2 where balance>=30000 



select branchs2.branchcode,branchs2.location,bankmaster2.acno,bankmaster2.cname,bankmaster2.city,bankmaster2.balance from branchs2,bankmaster2 where branchs2.branchcode=bankmaster2.branchcode



select count(Ttype) from banktransactions where Ttype='w'



select * from banktransactions order by Tdate asc



select * from bankmaster2 order by balance desc limit 1 offset 2



select branchcode,sum(balance) from  bankmaster2 where balance>=100000 group by branchcode



delimiter &&

create procedure bank () 

begin

select * from bankmaster2 where acno=12;
 
end;

delimiter &&
Footer
©