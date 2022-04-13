INSERT INTO pessoa (nome, idade, endereco, sexo) VALUES ('Ramon', 32, 'Rua dos Alfineiros', 'M');
INSERT INTO pessoa (nome, idade, endereco, sexo) VALUES ('Marron', 32, 'Rua dos Alfineiros', 'M');
INSERT INTO pessoa (nome, idade, endereco, sexo) VALUES ('Bombom', 32, 'Rua dos Alfineiros', 'M');
INSERT INTO pessoa (nome, idade, endereco, sexo) VALUES ('Profe', 35, 'Rua dos Alfineiros', 'M');

INSERT INTO professor(pessoa_id) VALUES (4);

INSERT INTO aluno (ano, pessoa_id) VALUES (5, 1);
INSERT INTO aluno (ano, pessoa_id) VALUES (5, 2);
INSERT INTO aluno (ano, pessoa_id) VALUES (6, 3);

INSERT INTO turma(nome, periodo, max_alunos, professor_id) VALUES ('Turma 1', 'Matutino', 20, 1);
INSERT INTO turma(nome, periodo, max_alunos, professor_id) VALUES ('Turma 2', 'Vespertino', 20, 1);
INSERT INTO turma(nome, periodo, max_alunos, professor_id) VALUES ('Turma 3', 'Noturno', 20, 1);