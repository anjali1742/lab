create database banking

use banking

create table bankmaster(acno int,cname varchar(30) not null,city varchar(40) default 'hyd',balance int not null,branchcode int,primary key(acno),foreign key(branchcode) references branchs2(branchcode),check(balance>=500))

desc bankmaster

insert into bankmaster values(10,'siva','chennai',15000,101),(11,'hari','madurai',16000,102),(12,'sai','villupuram',17000,103),(13,'vijay','guindy',18000,104),(14,'shakil','paris',19000,101)
 
select * from bankmaster

select cname from bankmaster where cname like '----%'

update bankmaster set balance=35000 where acno=11




create table branchs(branchcode int primary key ,location varchar(30) not null)

desc branchs

insert into branchs values(106,'annanagar'),(105,'jjnagar'),(102,'kananagar'),(103,'kamnagar'),(104,'westnagar')

select * from  branchs



create table banktransactions(acno int,Ttype char(1),Tdate datetime not null,amt int not null,foreign key(acno)references bankmaster2(acno))

desc banktransactions


insert into banktransactions values(10,'w','2022-05-10',12000),(11,'w','2022-06-17',17000),(12,'d','2022-05-29',19000),(11,'w','2022-07-18',16000),(13,'d','2022-04-10',18000)

select * from banktransactions
 


select * from bankmaster where balance>=30000 



select branchs.branchcode,branchs.location,bankmaster.acno,bankmaster.cname,bankmaster.city,bankmaster.balance from branchs,bankmaster where branchs.branchcode=bankmaster.branchcode



select count(Ttype) from banktransactions where Ttype='w'



select * from banktransactions order by Tdate asc



select * from bankmaster order by balance desc limit 1 offset 2



select branchcode,sum(balance) from  bankmaster where balance>=100000 group by branchcode



delimiter &&

create procedure bank () 

begin

select * from bankmaster where acno=12;
 
end;

delimiter &&
