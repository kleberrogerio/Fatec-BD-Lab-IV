CREATE TABLE alu_aluno (
  alu_id INT NOT NULL,
  tur_id INT NOT NULL,
  PRIMARY KEY (alu_id),
  CONSTRAINT `fk_alu_aluno_turma` FOREIGN KEY (tur_id) REFERENCES tur_turma(tur_id) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_alu_aluno_usuario` FOREIGN KEY (alu_id) REFERENCES usu_usuario (usu_id) ON DELETE NO ACTION ON UPDATE NO ACTION);