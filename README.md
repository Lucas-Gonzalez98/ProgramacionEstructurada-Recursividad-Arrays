# ProgramacionEstructurada-Recursividad-Arrays
Actividad 4 de Programacion Estructurada

Este repositorio ofrece una exploración teórica detallada sobre dos pilares de la programación: la recursividad y los arrays. Cada concepto se aborda en su propia carpeta, complementado con ejemplos prácticos implementados en Java.

## Contenido del Repositorio

El repositorio se estructura en las siguientes carpetas, cada una dedicada a un tema específico:

1.  **`recursividad/`**: Contiene una explicación exhaustiva del concepto de recursividad, la distinción entre recursividad e iteración, y una introducción a problemas clásicos que se resuelven de manera elegante con esta técnica.
2.  **`arrays/`**: Ofrece una descripción detallada de la estructura de datos array, sus características fundamentales y los diversos tipos de datos que pueden almacenar.
3.  **`arrays_con_recursividad/`**: Presenta una discusión sobre cómo los arrays pueden combinarse con la recursividad para resolver problemas eficientes, utilizando la búsqueda binaria como caso de estudio principal.

A continuación, se resume el contenido teórico esperado en cada carpeta:

---

### `recursividad/`

Esta sección se enfoca en el paradigma de la **recursividad**. Se define la recursividad como una técnica donde una función se invoca a sí misma para descomponer un problema en instancias más pequeñas hasta alcanzar un caso base resoluble directamente.

Se exploran las **diferencias fundamentales entre la recursividad y la iteración**, analizando sus respectivas estructuras de control, el manejo de la memoria (pila de llamadas vs. bucles), la legibilidad en ciertos escenarios y las consideraciones de rendimiento. Se discuten las situaciones típicas donde la recursividad ofrece una solución natural y concisa, en contraposición a los enfoques iterativos.

Finalmente, se introducen **ejemplos clásicos de problemas que se abordan recursivamente**, como el cálculo del factorial, la suma de dígitos, la secuencia de Fibonacci y el problema de las Torres de Hanoi. Se explica la lógica recursiva detrás de la solución de estos problemas, aunque los detalles de la implementación en Java se encuentran en los archivos correspondientes dentro de esta carpeta.

---

### `arrays/`

Esta sección se dedica al concepto de **arrays**. Se define un array como una colección finita y ordenada de elementos del mismo tipo, almacenados en ubicaciones de memoria contiguas y accesibles mediante un índice.

Se destacan las **características principales de los arrays**, incluyendo su almacenamiento contiguo, la posibilidad de tener un tamaño fijo (dependiendo del lenguaje), y la eficiencia del acceso aleatorio a sus elementos en tiempo constante.

Se describe la **versatilidad de los arrays para almacenar diferentes tipos de datos**, desde tipos primitivos (enteros, números de punto flotante, caracteres, booleanos) hasta objetos y, en el caso de arrays multidimensionales, otros arrays. Se mencionan ejemplos conceptuales de cómo se pueden declarar arrays para distintos tipos de datos, aunque la sintaxis específica en Java se ilustra en los ejemplos de código de la carpeta.

---

### `arrays_con_recursividad/`

Esta sección explora la **sinergia entre los arrays y la recursividad**, demostrando cómo se pueden combinar estas dos herramientas para diseñar algoritmos eficientes.

Se toma la **búsqueda binaria** como un ejemplo paradigmático. Se explica cómo este algoritmo, diseñado para encontrar un elemento en un array **ordenado**, puede implementarse de forma recursiva. Se describe el proceso de dividir repetidamente el espacio de búsqueda a la mitad, comparando el elemento central con el valor objetivo y realizando una llamada recursiva en la sub-sección relevante del array.

Se analiza la **eficiencia de la búsqueda binaria recursiva**, destacando su complejidad logarítmica en el tiempo de ejecución ($\mathcal{O}(\\log n)$). También se mencionan los **requisitos previos** para su correcto funcionamiento (un array ordenado) y se realiza una breve comparación conceptual con su contraparte iterativa en términos de claridad y posible sobrecarga de memoria debido a las llamadas recursivas. Los detalles de la implementación recursiva de la búsqueda binaria en Java se encuentran en los archivos de código dentro de esta carpeta.

-----

**¡Explora el Código!**

Para comprender completamente la aplicación práctica de los conceptos explicados en este `README`, te invitamos a explorar los archivos `.java` contenidos en cada una de las carpetas. Estos ejemplos de código ilustran de manera concreta las ideas teóricas presentadas aquí.

-----

**Contribuciones**

Cualquier comentario, sugerencia o identificación de posibles mejoras a las explicaciones teóricas es bienvenido. ¡Tu feedback es valioso para enriquecer este proyecto!
