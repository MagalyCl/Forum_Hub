create table topico (
    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensagem text not null,
    data_criacao timestamp not null,
    status varchar(255) not null default 'NAO_RESPONDIDO',
    autor_id bigint not null,
    curso varchar(100) not null,

    primary key(id),
    foreign key(autor_id) references usuario(id)
);