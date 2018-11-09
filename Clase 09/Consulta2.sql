create database mantenimiento
go
use mantenimiento
go
create table cliente(
id int identity(1,1) primary key,
nombre varchar(30) not null,
apellidoPat varchar(30) not null,
apellidoMat varchar(30) not null,
correo varchar(30) not null,
celular varchar(20) not null,
dni varchar(8) not null
)

go

insert into cliente values('David', 'Miguel', 'Kamimoto', 'david@gmail.com', '998163528', '43298986')
go
select * from cliente

DELETE FROM cliente WHERE id = '7';

insert into usuario values('gareca@gmail.com', '123');

select * from usuario

insert into cliente values('Carlos', 'Rodriguez', 'Rojas', 'carlos1@gmail.com', '998163528', '43298986')
insert into cliente values('Carlos II', 'Rodriguez', 'Rojas', 'carlos2@gmail.com', '998163528', '43298986')
insert into cliente values('Carlos III', 'Rodriguez', 'Rojas', 'carlos3@gmail.com', '998163528', '43298986')
insert into cliente values('Carlos IV', 'Rodriguez', 'Rojas', 'carlos4@gmail.com', '998163528', '43298986')