INSERT INTO usuario (cedula, clave, nombre, email) VALUES
(81977, 'Abc123*', 'ADRIANA OCAMPO', 'lamejorcientifica@colombia.com.co'),
(87719, 'Abc123*', 'MANUEL ELKIN PATARROLLO', 'elmejormedico@colombia.com.co'),
(190877, 'xYz_#', 'JOHN CARLOS ARRIETA ARRIETA', 'arrietajohn@gmail.com')
ON DUPLICATE KEY UPDATE
  clave = VALUES(clave),
  nombre = VALUES(nombre),
  email = VALUES(email);

INSERT INTO pelicula (nombre, titulo_original, director, genero, duracion_minutos, fecha_estreno, pais_origen, idioma_original, clasificacion_edad, productora, sinopsis) VALUES
('El Padrino', 'The Godfather', 'Francis Ford Coppola', 'Crimen', 175, '1972-03-24', 'Estados Unidos', 'Inglés', 'R', 'Paramount Pictures', 'La historia de la familia Corleone y el ascenso de Michael.'),
('Parásitos', 'Gisaengchung', 'Bong Joon-ho', 'Thriller', 132, '2019-05-30', 'Corea del Sur', 'Coreano', 'R', 'Barunson E&A', 'Dos familias se cruzan en una historia de tensión social.');

