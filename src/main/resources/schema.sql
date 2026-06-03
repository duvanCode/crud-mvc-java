CREATE TABLE IF NOT EXISTS usuario (
  cedula BIGINT NOT NULL,
  clave VARCHAR(255) NULL,
  nombre VARCHAR(255) NOT NULL,
  email VARCHAR(255) NULL,
  PRIMARY KEY (cedula)
);

CREATE TABLE IF NOT EXISTS pelicula (
  id BIGINT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(255) NOT NULL,
  titulo_original VARCHAR(255) NULL,
  director VARCHAR(255) NULL,
  genero VARCHAR(100) NULL,
  duracion_minutos INT NULL,
  fecha_estreno DATE NULL,
  pais_origen VARCHAR(100) NULL,
  idioma_original VARCHAR(100) NULL,
  clasificacion_edad VARCHAR(50) NULL,
  productora VARCHAR(255) NULL,
  sinopsis TEXT NULL,
  PRIMARY KEY (id)
);

