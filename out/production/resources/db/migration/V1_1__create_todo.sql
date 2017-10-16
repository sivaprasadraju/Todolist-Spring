
create table todo(
   id int,
   done int,
   title VARCHAR(20) not null,
   priority VARCHAR(6) not null,
   PRIMARY KEY (id)
);


insert into todo values
    (1, 0, 'Meeting', 'HIGH'),
    (2, 0, 'Meeting', 'MEDIUM'),
    (3, 0, 'Meeting', 'HIGH'),
    (4, 0, 'Meeting', 'LOW'),
    (5, 0, 'Meeting', 'HIGH');



select * from todo;