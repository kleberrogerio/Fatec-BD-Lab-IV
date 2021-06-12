CREATE TABLE pro_professor (
  pro_id INT NOT NULL,
  pro_titulacao VARCHAR(45) NULL,
  PRIMARY KEY (pro_id),
  CONSTRAINT fk_pro_professor_usuario FOREIGN KEY (pro_id) REFERENCES usu_usuario (usu_id) ON DELETE NO ACTION ON UPDATE NO ACTION);
