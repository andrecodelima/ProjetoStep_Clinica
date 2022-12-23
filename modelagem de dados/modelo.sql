Clínica Dentária  - Ortolima

CREATE DATABASE bd_ortolima
USE bd_ortolima

--Pacientes
CREATE TABLE Pacientes(

  id int PRIMARY kEY AUTO_INCREMENT,
  nome VARCHAR(50) NOT NULL,
  cpf VARCHAR(15) NOT NULL,
  telefone VARCHAR(15) NOT NULL,
  nascimento DATE NOT NULL,
  endereco VARCHAR(50) NOT NULL,
  email VARCHAR(100)

);


-- Medicos
CREATE TABLE medicos(

  id INT PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(50) NOT NULL,
  cpf VARCHAR(15) NOT NULL,
  crm VARCHAR(15) NOT NULL, 
  telefone VARCHAR(15) NOT NULL,
  nascimento DATE NOT NULL,
  endereco VARCHAR(50) NOT NULL,
  email VARCHAR(100)



);



- Cadastros:
  -Pacientes (nome,cpf, nascimento e telefone)
  -Médicos (nome, CRO, Especialidade)

  