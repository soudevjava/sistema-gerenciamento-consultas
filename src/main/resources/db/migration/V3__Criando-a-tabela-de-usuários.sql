-- Criando a tabela de usuários
CREATE TABLE usuario
(
    id_usuario BIGINT      NOT NULL AUTO_INCREMENT,
    email      VARCHAR(40) NOT NULL UNIQUE,
    nome       VARCHAR(50) NOT NULL,
    senha      VARCHAR(50) NOT NULL,
    perfil     TINYINT     NOT NULL CHECK (perfil BETWEEN 0 AND 2),
    PRIMARY KEY (id_usuario)
) ENGINE = InnoDB;