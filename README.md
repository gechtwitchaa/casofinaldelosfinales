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






























