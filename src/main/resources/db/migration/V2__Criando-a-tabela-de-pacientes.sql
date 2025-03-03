-- Criando a tabela de pacientes
CREATE TABLE paciente
(
    id_paciente     BIGINT       NOT NULL AUTO_INCREMENT,
    cpf             VARCHAR(14)  NOT NULL UNIQUE,
    telefone        VARCHAR(15)  NOT NULL,
    nome            VARCHAR(50)  NOT NULL,
    endereco        VARCHAR(100) NOT NULL,
    data_nascimento DATETIME(6),
    PRIMARY KEY (id_paciente)
) ENGINE = InnoDB;