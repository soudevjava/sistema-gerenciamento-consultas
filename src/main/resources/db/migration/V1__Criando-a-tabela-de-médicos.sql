-- Criando a tabela de médicos
CREATE TABLE medico
(
    id_medico BIGINT      NOT NULL AUTO_INCREMENT,
    crm       VARCHAR(20) NOT NULL UNIQUE,
    nome      VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_medico)
) ENGINE = InnoDB;