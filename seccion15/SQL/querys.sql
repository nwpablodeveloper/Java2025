-- Crear una base de datos
CREATE SCHEMA `zona_fit_db` ;

-- Crear Tablas
CREATE TABLE `zona_fit_db`.`cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `apellido` VARCHAR(45) NULL,
  `membresia` INT NULL,
  PRIMARY KEY (`id`),
  -- El valor de la membresia es unico en la tabla
  UNIQUE INDEX `membresia_UNIQUE` (`membresia` ASC) VISIBLE);

-- Seleccionar una Tabla
-- READ
  SELECT * FROM zona_fit_db.cliente;


  -- CRUD , CREATE, READ, UPDATE, DELETE

  -- CREATE
INSERT INTO `zona_fit_db`.`cliente` 
(`nombre`, `apellido`, `membresia`) 
VALUES ('Gabriel', 'Flores', '100');

-- UPDATE
UPDATE `zona_fit_db`.`cliente` 
SET `apellido` = 'Juarez', `membresia` = '300' 
WHERE (`id` = '1');

-- DELETE
DELETE FROM cliente
WHERE id=3