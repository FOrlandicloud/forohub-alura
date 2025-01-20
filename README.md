# Proyecto de Autenticación y Gestión de Usuarios

Este proyecto es una API REST desarrollada con **Spring Boot** que proporciona servicios de autenticación y gestión de usuarios, incluyendo la creación, actualización, eliminación y listado de usuarios, respuestas y temas (tópicos). La autenticación se realiza mediante JWT (JSON Web Tokens).

## Tecnologías

- **Java 17** o superior
- **Spring Boot** (Starter Web, Data JPA, Security)
- **Spring Security** para autenticación y autorización
- **Flyway** para migraciones de base de datos
- **JWT** para manejo de tokens
- **MySQL** como base de datos

## Descripción

Este repositorio contiene varias clases que exponen servicios REST para gestionar **Usuarios**, **Respuestas** y **Temas**. A continuación, se describen los controladores y las acciones correspondientes:

### 1. **AutenticaciónController** (`/login`)

- **Método POST**: Autentica un usuario mediante correo y contraseña y devuelve un JWT.
- Dependencias clave: `AuthenticationManager`, `TokenService`.

### 2. **UsuarioController** (`/usuarios`)

- **Método POST**: Registra un nuevo usuario.
- **Método GET**: Lista usuarios con paginación.
- **Método GET** (`/{id}`): Obtiene un usuario específico por ID.
- **Método PUT**: Actualiza los datos de un usuario.
- **Método DELETE** (`/{id}`): Elimina un usuario por ID.

### 3. **TopicoController** (`/topicos`)

- **Método POST**: Registra un nuevo tema (topico).
- **Método GET**: Lista todos los temas con paginación.
- **Método GET** (`/{id}`): Obtiene un tema específico por ID.
- **Método PUT**: Actualiza un tema existente.
- **Método DELETE** (`/{id}`): Elimina un tema por ID.

### 4. **RespuestaController** (`/respuestas`)

- **Método POST**: Registra una respuesta a un tema.
- **Método GET**: Lista todas las respuestas.
- **Método GET** (`/{id}`): Obtiene una respuesta por ID.

## Requisitos

1. **JDK 17** o superior.
2. **MySQL** configurado en tu entorno.
3. **Maven** para gestión de dependencias.

## Instalación

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/tu-repositorio.git
2. Navega a la carpeta del proyecto:
   ```bash
   cd tu-repositorio
3. Compila e instala las dependencias:
    ```bash
    mvn clean install

4. Asegúrese de que MySQL esté en ejecución y cree una base de datos. Luego, configura las credenciales de la base de datos en el archivo application.properties:
   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/tu_base_de_datos
   spring.datasource.username=usuario
   spring.datasource.password=contraseña

5. Ejecuta la aplicación:
   ```bash
   mvn spring-boot:run

6. La API estará disponible en http://localhost:8080.

## Dependencias
- **Archivo pom.xml**
   ```bash
   <dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.flywaydb</groupId>
        <artifactId>flyway-core</artifactId>
    </dependency>
    <dependency>
        <groupId>org.flywaydb</groupId>
        <artifactId>flyway-mysql</artifactId>
    </dependency>
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    <dependency>
        <groupId>com.auth0</groupId>
        <artifactId>java-jwt</artifactId>
        <version>4.4.0</version>
    </dependency>
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.5.0</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.security</groupId>
        <artifactId>spring-security-test</artifactId>
        <scope>test</scope>
    </dependency>
  </dependencies>

## Autenticación y seguridad
La API utiliza Spring Security con JWT para asegurar los puntos finales. Al autenticar un usuario con /login, se genera un token JWT que debe ser utilizado para acceder a los recursos protegidos de la API.

## Contribución
Si deseas contribuir, siéntete libre de abrir una solicitud de extracción. Se agradecerán mejoras en la seguridad, nuevas funcionalidades y pruebas.
