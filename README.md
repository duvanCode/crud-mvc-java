# CRUD MVC Spring Boot

Aplicación web con Spring Boot (MVC + Thymeleaf) basada en las guías de la universidad:
- CRUD de Usuarios
- CRUDL de Películas

## Requisitos
- Java 11 (recomendado por la guía) o Java 8+
- MySQL en XAMPP/WAMP (localhost:3306)
- BD: `mi_base_de_datos` (usuario `root`, sin contraseña)

## Ejecutar
1. Crear la base de datos:
   - `CREATE DATABASE mi_base_de_datos;`
2. Iniciar la app:
   - `mvn spring-boot:run`
3. Abrir:
   - `http://localhost:8080/` (Usuarios)
   - `http://localhost:8080/peliculas` (Películas)

