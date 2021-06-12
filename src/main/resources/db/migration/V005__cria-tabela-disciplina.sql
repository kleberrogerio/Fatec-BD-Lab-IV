CREATE TABLE dis_disciplina (
  dis_id INT NOT NULL AUTO_INCREMENT,
  dis_nome VARCHAR(45) NOT NULL,
  dis_cargahoraria INT(5) NOT NULL,
  dis_ementa VARCHAR(200) NOT NULL,
  cur_id INT NOT NULL,
  tur_id INT NOT NULL,
  pro_id INT NOT NULL,
  PRIMARY KEY (`dis_id`),
  CONSTRAINT `fk_disciplina_curso1` FOREIGN KEY(cur_id) REFERENCES cur_curso(cur_id) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_disciplina_turma1` FOREIGN KEY (tur_id) REFERENCES tur_turma(tur_id) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_disciplina_pro_professor1` FOREIGN KEY (pro_id) REFERENCES pro_professor(pro_id) ON DELETE NO ACTION ON UPDATE NO ACTION);