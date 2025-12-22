# Conditionals and Loops

Estos ejercicios son tomados del libro **Computer Science: An Interdisciplinary Approach** [[link]](https://introcs.cs.princeton.edu/java/home/). 

### 1.3.21 Conversión de base genérica (K-ary)

Escriba un programa denominado **Kary** que reciba dos argumentos de línea de comandos, $i$ y $k$, y convierta el entero $i$ a su representación en base $k$. Suponga que $i$ es un entero de tipo `long` (según el estándar de Java) y que $k$ es un entero en el rango $[2, 16]$. Para bases superiores a 10, utilice las letras de la **A** a la **F** para representar los dígitos del 11 al 16, respectivamente.

### 1.3.28 Experimentos de eficiencia en factorización

Realice experimentos rápidos para determinar el impacto de utilizar la condición de parada $(factor \le n / factor)$ en lugar de $(factor < n)$ en el programa **Factors** (Programa 1.3.9). Para cada método, identifique el valor de $n$ más grande tal que, al ingresar un número de $n$ dígitos, el programa garantice su finalización en un tiempo inferior a 10 segundos.

### 1.3.31 Tabla de números primos relativos

Desarrolle un programa llamado **RelativelyPrime** que reciba un argumento de línea de comandos $n$ e imprima una tabla de dimensiones $n \times n$. En dicha tabla, se debe mostrar un asterisco (`*`) en la posición correspondiente a la fila $i$ y columna $j$ si el máximo común divisor (MCD) de $i$ y $j$ es igual a 1 (es decir, si $i$ y $j$ son primos relativos); en caso contrario, se debe mostrar un espacio en blanco.

### 1.3.34 El taxi de Ramanujan

Srinivasa Ramanujan fue un matemático indio célebre por su excepcional intuición numérica. Se cuenta que, cuando el matemático inglés G. H. Hardy lo visitó, este último comentó que el número de su taxi era el 1729, una cifra que le parecía carente de interés. Ramanujan replicó: *"¡No, Hardy! Es un número muy interesante. Es el número más pequeño expresable como la suma de dos cubos de dos maneras diferentes"*.

Verifique esta afirmación escribiendo un programa que reciba un argumento entero $n$ e imprima todos los enteros menores o iguales a $n$ que puedan expresarse como la suma de dos cubos de dos formas distintas. En otras palabras, encuentre enteros positivos distintos $a, b, c$ y $d$ tales que:

$$a^3 + b^3 = c^3 + d^3$$

Para la implementación, utilice **cuatro ciclos `for` anidados**.

### 1.3.36 Conteo de números primos

Escriba un programa llamado **PrimeCounter** que reciba un argumento de línea de comandos $n$ y determine la cantidad de números primos menores o iguales a $n$. Utilice el programa para calcular el total de números primos hasta 10 millones. 

> **Nota:** Si no se procede con cautela en el diseño del algoritmo, es posible que el programa no finalice en un tiempo computacional razonable.

### 1.3.37 Caminata aleatoria bidimensional (2D Random Walk)

Una caminata aleatoria en dos dimensiones simula el comportamiento de una partícula que se desplaza sobre una cuadrícula de puntos. En cada paso, la partícula se mueve hacia el norte, sur, este u oeste con una probabilidad de $1/4$, independientemente de sus movimientos previos. 

Desarrolle un programa llamado **RandomWalker** que reciba un argumento entero $n$ y estime cuánto tiempo (número de pasos) le tomará a la partícula alcanzar el límite de un cuadrado de $2n \times 2n$ centrado en el punto de origen.

**Diapositivas**: [[pdf]](https://introcs.cs.princeton.edu/java/lectures/keynote/CS.2.Loops.pdf)
