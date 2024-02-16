## ¿Que es Java?

Es un lenguaje de programación multiproposito para la creación de juegos, aplicaciones de escritorio, procesos de servidor, microcontroladores desarrollador por sun microsystem pero adquirdo por oracle.

- Java SE (Java Standar Edition): Aplicaciones de escritorio o de servidor que no requieran componentes empresariales.
- Java EE (Enterprise Edition): Tiene el poder para procesos mas empresariales permitiendo conexiones a redes o web.
- Java ME (Micro Edition): Software para microcontroladores.

## Open JDK

No contiene librerias propietarias por lo que es gratis a menos que se requiera algo extra podria ser de paga

## Java Program Translation

Java necesita una maquina virtual (Java runtime environment)

```
Hello.java -> javac -> Hello.class
Code -> Java Compiler -> Java bytecode
```
## Instalación y configuracion de Java en SO Windows

Para instalar OpenJDK en Windows  se realizara lo siguiente:

1. Descargar los binarios de la pagina de OpenJDK
   - Binario: https://jdk.java.net/21/
2. Se descomprime el archivo `zip` descargardo.
   - Clic derecho sobre el archivo y `Extraer todo`
   - Seleccionamos la ubicación de instalación por ejemplo ``C:\Program Files\java\``
   - Se ha creado la carperta `jdk-21.0.2` por lo que esta se guardara en la ruta del paso anterior
3. Creación de las variables de entorno

Se debe crear la variable de entorno `JAVA_HOME` y se debe actualizar la variable de entorno `PATH`. La primera se utilizara para que java sepa donde se escuentra la instalación del JDK y la segunda es para poder ejecutar los comandos de java (como javac, java, etc) desde cualquier lugar.

3.1. JAVA_HOME 
    
- Se deberá crear una nueva variable de entorno con el nombre de `JAVA_HOME` que llevara por valor algo como: `C:\Program Files\java\jdk-21.0.2`

3.2. PATH 
    
- Se deberá agregar al ``PATH`` el valor de: `C:\Program Files\java\jdk-21.0.2\bin` o `%JAVA_HOME%\bin`

Finalmente escribimos en nuestra terminal ``java --version`` y aparecera un texto similar a:

```
λ java --version

openjdk 21.0.2 2024-01-16
OpenJDK Runtime Environment (build 21.0.2+13-58)
OpenJDK 64-Bit Server VM (build 21.0.2+13-58, mixed mode, sharing)
```