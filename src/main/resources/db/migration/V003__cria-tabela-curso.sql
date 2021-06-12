CREATE TABLE cur_curso (
  cur_id INT NOT NULL AUTO_INCREMENT,
  cur_nome VARCHAR(45) NOT NULL,
  cur_periodicidade VARCHAR(1) NOT NULL COMMENT 'M - Período Matutino\nT - Período Vespertino\nN - Período Noturno',
  cur_descricao VARCHAR(100) NOT NULL,
  PRIMARY KEY (`cur_id`));