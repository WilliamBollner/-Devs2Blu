INSERT INTO pessoa (nome, idade, endereco, sexo) VALUES ('Ramon', 32, 'Rua Alfineiros', 'M');
INSERT INTO pessoa (nome, idade, endereco, sexo) VALUES ('William', 18, 'Rua Doida', 'M');
INSERT INTO pessoa (nome, idade, endereco, sexo) VALUES ('Aipim', 32, 'Rua Alpineiras', 'F');
INSERT INTO pessoa (nome, idade, endereco, sexo) VALUES ('Aipi', 32, 'Rua Alpineira', 'F');

INSERT INTO professor (pessoa_id) VALUES (4);


INSERT INTO aluno (ano, pessoa_id) VALUES (5, 1);
INSERT INTO aluno (ano, pessoa_id) VALUES (5, 2);
INSERT INTO aluno (ano, pessoa_id) VALUES (6, 3);

INSERT INTO turma (nome, periodo, max_alunos, professor_id) VALUES ('Turma 1', 'Matutino', 20, 4);
INSERT INTO turma (nome, periodo, max_alunos, professor_id) VALUES ('Turma 2', 'Vespertino', 20, 4);
INSERT INTO turma (nome, periodo, max_alunos, professor_id) VALUES ('Turma 3', 'Noturno', 20, 4);