-- Criando a tabela de consultas
CREATE TABLE consulta
(
    id_consulta     BIGINT  NOT NULL AUTO_INCREMENT,
    id_medico       BIGINT  NOT NULL,
    id_paciente     BIGINT  NOT NULL,
    data_consulta   DATETIME(6) NOT NULL,
    status_consulta TINYINT NOT NULL CHECK (status_consulta BETWEEN 0 AND 4),
    PRIMARY KEY (id_consulta),
    FOREIGN KEY (id_medico) REFERENCES medico (id_medico),
    FOREIGN KEY (id_paciente) REFERENCES paciente (id_paciente)
) ENGINE = InnoDB;