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

## Instalación y configuracion de Java en SO Linux

Para instalar OpenJDK en Windows  se realizara lo siguiente:

1. Descargar los binarios de la pagina de OpenJDK
   - Binario: https://jdk.java.net/21/
2. Descomprimir el binario en la carpeta de destino. Generalmente es en `/opt/java`
   - Crea la carpeta `java` dentro de `opt`
   - Descomprime el binario
```sh
sudo mkdir -p /opt/java
sudo tar xvf open open openjdk-21.*_bin.tar.gz -C /opt/java
```
3. Crea las variables de entorno
   - JAVA_HOME: Esta variable la utiliza java para saber dónde se encuentran sus binarios

```sh
export JAVA_HOME=/ruta/destino/versionjava
// en nuestro ejemplo, la ruta seria:
// /opt/java/jdk-21.0.2
// Nota: debes de tener cuidado de NO colocar el slash / al final.
```
Entonces bajo esto deberiamos de tener algo similar a lo siguiente:

```sh
sudo nano ~/.bashrc
export JAVA_HOME=/opt/java/jdk-21.0.2
export PATH=$PATH:$JAVA_HOME/bin
// Ctl + x
source ~/.bashrc

# O

export JAVA_HOME=~/.jdks/openjdk-18.0.1.1/
export PATH=$PATH:$JAVA_HOME/bin
```

## Convenciones de Java

- El archivo debe iniciar con mayuscula por ejemplo `Hola.java`
- Debe iniciar con `class`
- La clase debe ser el nombre del archivo `class Hola {}`
- Se compila como `javac Hola.java`  // crea un archivo Hola.class
- Se ejecuta ahora como `java Hola` // sin extensión
- Operadores aritmeticos

```
. + - * / ()

Jerarquia
Operador . (POO), operador ()
Primero * / (Prioridad de izq a der)
Segundo + - (Prioridad de izq a der)
```
- Operadores logicos

```java
int edad = 15;
boolean ninez = edad <= 11 && edad >= 0;
System.out.println(ninez); // false
```
- Condicionales
  
```java
if(){}
else if (){}
else if (){}
else if...N(){}
else {}
```
