CREATE TABLE usu_usuario (
  usu_id INT NOT NULL AUTO_INCREMENT,
  usu_email VARCHAR(30) NOT NULL,
  usu_senha VARCHAR(45) NOT NULL,
  usu_nome VARCHAR(45) NOT NULL,
  PRIMARY KEY (`usu_id`));