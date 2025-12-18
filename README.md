# Repaso de programación - UdeA

Este repositorio contiene implementaciones y ejercicios basados en el libro "Algorithms, 4th Edition" de Sedgewick y Wayne.

## Requisitos Previos

* Java Development Kit (JDK) xx o superior.
* Maven instalado (opcional si se usa un IDE que lo integre).

## Configuración Inicial

* Clonar este repositorio en su máquina local.


## Ejecución de los códigos

### Ejecución Independiente del IDE (Terminal)

Para compilar y ejecutar el código sin depender de un entorno visual, utilice los comandos de Maven desde la raíz del proyecto:

1. Compilar el proyecto:
   
   ```
   mvn clean compile
   ```

2. Ejecutar la prueba de verificación:

   ```
   mvn exec:java -Dexec.mainClass="edu.udea.repaso.cap1_fundamentos.TestAlgs4"
   ```

### Importación en entornos de desarrollo (IDE)

Gracias a la configuración de Maven (`pom.xml`), el proceso es automático:
* **IntelliJ / VS Code / NetBeans / Eclipse**: Simplemente seleccione "Abrir Proyecto" o "Importar Proyecto" y elija el archivo `pom.xml`. El IDE reconocerá automáticamente la librería en la carpeta `/lib` y configurará el classpath.


## Clase de Verificación (TestAlgs4.java)

Ubicada en: `src/main/java/edu/udea/repaso/tests/TestAlgs4.java` se encuentra la clase

```java
package edu.udea.repaso.tests;
import edu.princeton.cs.algs4.StdOut;

/**
 * Clase de prueba para validar la integración de la librería algs4.jar.
 */
public class TestAlgs4 {
    public static void main(String[] args) {
        StdOut.println("Estado del sistema: Configuración exitosa.");
        StdOut.println("Librería algs4 detectada y vinculada correctamente.");
    }
}
```


