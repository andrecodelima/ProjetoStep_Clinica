Clínica Dentária  - Ortolima

CREATE DATABASE dbClinica
USE dbClinica

--Dentista
CREATE TABLE dentista(

id int primary key auto_increment,
nome  varchar(100)     not null,
nascimmento date      not null,
cpf varchar(15)       not null,
rg  varchar(15)       not null,
cro varchar(15)       not null,
telefone  varchar(15) not null,
endereco  varchar(100) not null,
email varchar(100)     not null,
sexo  varchar(15)     not null

);

-- Paciente
CREATE TABLE paciente(

id  int primary key auto_increment
nome  varchar(30)       not null,
nascimmento date        not null,
cpf varchar(15)         not null,
rg  varchar(15)         not null,
telefone  varchar(15)   not null,
endereco  varchar(50)   not null,
email varchar(30)       not null,
sexo  varchar(15)       not null,
responsavel varchar(15) not null


);


-- Funcionario
CREATE TABLE funcionario(

id int primary key auto_increment
nome  varchar(30)       not null,
nascimmento date        not null,
cpf varchar(15)         not null,
rg  varchar(15)         not null,
telefone  varchar(15)   not null,
endereco  varchar(50)   not null,
email varchar(30)       not null,
sexo  varchar(15)       not null,
funcao  varchar(20)     not null


);





- Cadastros:
  -Pacientes (nome,cpf, nascimento e telefone)
  -Médicos (nome, CRO, Especialidade)

  