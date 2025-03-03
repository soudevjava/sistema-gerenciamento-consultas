-- Inserindo um médico
INSERT INTO medico (crm, nome)
VALUES
    ('123456-DF', 'Dr. João Silva'),
    ('789012-SP', 'Dra. Ana Souza');

-- Inserindo pacientes
INSERT INTO paciente (cpf, telefone, nome, endereco, data_nascimento)
VALUES
    ('123.456.789-00', '(61) 91234-5678', 'Maria Oliveira', 'Rua das Flores, 123, Brasília - DF', '1990-05-15 08:30:00'),
    ('987.654.321-00', '(11) 99876-5432', 'Carlos Mendes', 'Av. Paulista, 456, São Paulo - SP', '1985-09-22 14:00:00');

-- Inserindo usuários
INSERT INTO usuario (email, nome, senha, perfil)
VALUES
    ('joao.silva@email.com', 'João Silva', 'senha123', 1),  -- 1: Exemplo de perfil de médico
    ('ana.souza@email.com', 'Ana Souza', 'senha456', 1),
    ('maria.oliveira@email.com', 'Maria Oliveira', 'senha789', 2), -- 2: Exemplo de perfil de paciente
    ('carlos.mendes@email.com', 'Carlos Mendes', 'senha000', 2);

-- Inserindo consultas
INSERT INTO consulta (id_medico, id_paciente, data_consulta, status_consulta)
VALUES
    (1, 1, '2025-03-10 10:00:00.000000', 1), -- 1: Consulta agendada
    (2, 2, '2025-03-12 14:30:00.000000', 2); -- 2: Consulta concluída
