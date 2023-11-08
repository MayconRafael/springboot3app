drop schema if exists anotacao;

drop user if exists 'user'@'localhost';

create schema anotacao;

create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on anotacao.* to user@'localhost';

use anotacao;

create table tmp_temperatura (
    tmp_id bigint primary key auto_increment,
    tmp_data_hora datetime not null,
    tmp_medida float not null,
    tmp_umidade float,
    tmp_particulas float
);
insert into tmp_temperatura (tmp_data_hora, tmp_medida, tmp_umidade, tmp_particulas)
 values ('2023-10-24 10:00', 25.4, null, 31.3),
        ('2023-10-24 11:00', 26.1, 43.2, null);