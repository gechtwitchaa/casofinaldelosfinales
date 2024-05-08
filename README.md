# casofinaldelosfinales
https://github.com/gechtwitchaa/casofinaldelosfinales.git

EJERCICIO 1: 
1) En relación al estado de un objeto, para preservar el principio de encapsulación:
b) Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos
de una clase. Así, cualquier software que utilice nuestro objeto, sólo accederá al
estado de los objetos mediante los métodos que le hayamos permitido utilizar.

2) Los métodos de una clase no pueden devolver objetos:
   b) Falso

3) ¿Cuál de las siguientes características de la programación orientada a objetos está
relacionada con la reutilización de código?
b) Herencia

4) El tiempo de acceso a un dato en una lista de tipo LinkedList es en el mejor de los casos de:
b) O(1)

5) Un algoritmo de ordenación que implemente el método de inserción se basa en la idea de ir
seleccionando el número correspondiente en la lista desordenada que se va a insertar en la
posición última de la lista ordenada:
b) Falso


EJERCICIO 2: 
1) Debemos diseñar un programa para un s i stema de dispositivos portables
aplicados en telemedicina que contienen una cantidad de memoria muy
l imitada ( 4 KB). Tenemos diferentes alternativ as que hacen diferente uso de la
computación y la memoria
c) La tercera y última t iene una comple jidad computacional de O( log 2 ( N)) y
ocupa un poco más de espacio en memoria S(O( log 2 (N))).
ya que ofrece un buen equilibrio entre eficiencia computacional y el uso de memoria, lo que es muy importante para un sistema como el anterior

 996335.

2) Explica las diferencias entre una tabla Hash y un árbol. ¿ Cuándo conviene utilizar
cada una de estas estructuras? Justifique su respuesta y analice todas las
posibles operaciones a realizar por las estructuras. No redacte el orden tal y
como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.

-Una tabla hash es una estructura que mapea claves a valores mediante una función hash. Es decir, utiliza una función para calcular la posición donde se almacenará un valor en una estructura de datos, generalmente un arreglo.
podemos utilizar una tabla Hash cuando se necesita un acceso rápido a los datos y las claves, para implementar conjuntos o diccionarios, donde se necesita buscar, insertar y eliminar elementos, en situaciones donde la distribución de las claves es desconocida pero se requiere un acceso rápido. 

-Operaciones:
Búsqueda O(1) promedio, O(n) en caso de colisiones.
Inserción O(1) promedio, O(n) en el peor caso.
Eliminación O(1) promedio, O(n) en el peor caso.
Actualización Búsqueda + Inserción, O(1) promedio.

-Un árbol es una estructura jerárquica donde cada elemento se representa como un nodo. Los nodos están conectados entre sí mediante enlaces llamados ramas. Hay varios tipos de árboles, como árboles binarios, árboles AVL, árboles rojo-negro, etc. 
Podemos utilizar un arbol cuando se necesite ordenar y buscar elementos de manera eficiente, cuando se necesite iterar sobre los datos en orden.

-Operaciones:
Búsqueda O(log n) en promedio, O(n) en el peor caso (en árboles desbalanceados).
Inserción O(log n) en promedio, O(n) en el peor caso (en árboles desbalanceados).
Eliminación O(log n) en promedio, O(n) en el peor caso.
Actualización Búsqueda + Inserción, O(log n) en promedio.


3) Explica las di ferencias entre una pila y una cola. ¿Cuándo conviene utilizar cada
una de estas estructuras? ¿Cuál es el orden de comple jidad computacional de
estas estructuras?No redacte el orden tal y como puede ver en los apuntes,
razónelo con sus propias palabras y argumentos.

PILA:
-Una pila es una estructura de datos lineal que sigue el principio LIFO (Last In, First Out), lo que significa que el último elemento que se inserta es el primero en ser eliminado.

-Las operaciones en una pila son:
Push: Agrega un elemento a la cima de la pila.
Pop: Elimina y devuelve el elemento superior de la pila.
Peek o Top: Devuelve el elemento superior de la pila sin eliminarlo.

-Las pilas son útiles para resolver problemas relacionados con la reversión de secuencias, procesamiento de expresiones matemáticas, manejo de llamadas de funciones en la pila de ejecución, entre otros.

-podemos utilizar una pila cuando necesitas acceso rápido al último elemento, cuando necesitas procesar elementos en orden inverso al que fueron agregados. 

-Orden de complejidad computacional: Push, Pop, Peek: O(1). Estas operaciones son constantes porque solo involucran manipulación de punteros.

COLA:
-Una cola es una estructura de datos lineal que sigue el principio FIFO (First In, First Out), lo que significa que el primer elemento que se inserta es el primero en ser eliminado.

-Las operaciones de una cola son:
Enqueue: Agrega un elemento al final de la cola.
Dequeue: Elimina y devuelve el elemento del frente de la cola.
Front: Devuelve el elemento del frente de la cola sin eliminarlo.

-Las colas son útiles para simular procesos que implican la espera en línea, como la gestión de tareas en un sistema operativo, el manejo de solicitudes en un servidor, etc.

-podemos utilizar las colas cuando necesites procesar elementos en el orden en que fueron agregados, cuando necesitas simular procesos de espera o de cola. 

-Orden de complejidad computacional: Enqueue, Dequeue, Front: O(1). Al igual que en las pilas, estas operaciones son constantes porque también involucran manipulación de punteros.




4) Explica el método de ordenación denominado inserción y describe las
iteraciones sobre el siguiente conjunto de datos:
50 20 84 13 22 16 89 85

El método de ordenación por inserción funciona de la siguiente manera:

Comienza con el segundo elemento de la lista.
Compara este elemento con los elementos anteriores uno por uno, y los mueve hacia la derecha hasta encontrar su posición correcta.
Repite este proceso para cada elemento de la lista.
Para el conjunto de datos proporcionado: 50 20 84 13 22 16 89 85, las iteraciones serían así:

Inicio: 50 | 20 84 13 22 16 89 85
Paso 1: 20 50 | 84 13 22 16 89 85
Paso 2: 20 50 84 | 13 22 16 89 85
Paso 3: 13 20 50 84 | 22 16 89 85
Paso 4: 13 20 22 50 84 | 16 89 85
Paso 5: 13 16 20 22 50 84 | 89 85
Paso 6: 13 16 20 22 50 84 89 | 85
Paso 7: 13 16 20 22 50 84 85 89 |





EJERCICIO 3: 
Dado el siguiente algoritmo recursivo:

a) ¿Qué imprime el código? En caso de que no compile indique el motivo y arregle el programa 
el codigo deberia imprimir un valor numerico pero no compila (la solucion del codigo estara en intelliJ como "Main")

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a = recursive(1, -2);
        System.out.println(a);
    }

    public static int recursive(int a, int b){
        if (b < 0) {
            return 0; 
        } else if (b == 0) {
            return 1;
        } else if (a == 0) {
            return 0;
        } else {
            return a * recursive(a, b - 1);
        }
    }
}


b) Explica brevemente qué cálculo está haciendo y qué tipo de recursividad está empleando.

El algoritmo realiza un cálculo recursivo multiplicando un número a por sí mismo b veces, donde a es el primer parámetro y b es el segundo parámetro de la función recursive.
Cuando b es 0, el algoritmo devuelve 1, ya que cualquier número elevado a la potencia 0 es 1.
Cuando a es 0, el algoritmo devuelve 0, ya que cualquier número multiplicado por 0 es 0.
Si ninguno de los casos anteriores se cumple, el algoritmo se llama a sí mismo con b-1, lo que significa que reduce el exponente en 1 en cada llamada, y multiplica a por el resultado de la llamada recursiva.
Por lo tanto, la función realiza un cálculo recursivo de la potencia de a elevado a b.

La recursividad empleada es de tipo descendente, ya que en cada llamada recursiva el valor de b se reduce en 1.


EJERCICIO 4: 
Calcular de forma recursiva la suma de los dígitos de un número siendo un ejemplo el número 102 ->
1 + 0 + 2 = 3. Recuerde que puede realizar los cambios de tipo que crea necesarios para facilitar la
resolución:
¿ Qué t ipo de recursividad se está empleando? ¿ Qué comple jidad computacional
tiene el algoritmo?

public class SumaDigitosRecursiva {

    // Método para calcular la suma de los dígitos recursivamente
    public static int sumaDigitos(int numero) {
        // Caso base: si el número es menor que 10, retornamos el número mismo
        if (numero < 10) {
            return numero;
        } else {
            // Obtenemos el último dígito
            int ultimoDigito = numero % 10;
            // Llamamos recursivamente al método con el número sin el último dígito
            return ultimoDigito + sumaDigitos(numero / 10);
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        int numero = 102;
        System.out.println("La suma de los dígitos de " + numero + " es: " + sumaDigitos(numero));
    }
}


(SumaDigitosRecursiva)

-El tipo de recursividad que se está empleando es la "recursión descendente", donde el método se llama a sí mismo con un parámetro más pequeño hasta que se alcanza un caso base.

-La complejidad computacional de este algoritmo es lineal, es decir, 𝑂(𝑛), donde 𝑛 es la cantidad de dígitos en el número. Esto se debe a que en cada llamada recursiva reduce el tamaño del número en un dígito.































