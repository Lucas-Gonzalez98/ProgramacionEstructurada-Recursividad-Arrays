# 💻 Proyecto Java – Arrays, Recursividad e Iteración

Este proyecto reúne tres mini-proyectos desarrollados con el objetivo de **comprender conceptos clave de la programación estructurada** en Java. Cada sección aborda un tema fundamental que todo programador debe dominar: arrays, recursividad e iteración. A través de ejemplos prácticos y comparativos, se busca fomentar el aprendizaje mediante la experimentación con código real.

---

## 📚 Índice

1. 🔢 [Arrays](#-parte-1-arrays)  
2. 🔄 [Recursividad vs Iteración](#-parte-2-recursividad-vs-iteración)  
3. 🔍 [Recursividad con Arrays](#-parte-3-recursividad--arrays)  
4. ✅ [Conclusión general](#-conclusión-general)  

---

## 🔢 Parte 1: Arrays

### 🧠 ¿Qué son los arrays?

Un **array** (o arreglo) es una estructura de datos que permite almacenar múltiples valores del mismo tipo bajo un solo nombre de variable. Cada elemento del array se accede mediante un índice numérico, comenzando desde 0.

### 🎯 Objetivo de esta sección

- Entender cómo se crean arrays de distintos tipos (enteros, decimales, caracteres, cadenas, booleanos).
- Saber cómo recorrerlos y acceder a sus elementos.
- Aprender a modificar valores y trabajar con arrays dinámicos.
- Usar métodos para imprimir contenido de arrays reutilizando código.

### 🛠️ Lo que vas a encontrar

- Arrays estáticos y dinámicos.
- Bucles `for` tradicionales para recorrer arrays.
- Uso de la clase `Scanner` para ingresar datos.
- Creación de arrays de números aleatorios.
- Métodos personalizados para imprimir arrays de cualquier tipo.

### 🧪 Ejemplo de uso básico

```java
int[] numeros = {10, 20, 30};
System.out.println("Primer número: " + numeros[0]); // Imprime 10

numeros[0] = 99; // Modificamos el valor
System.out.println("Nuevo valor: " + numeros[0]); // Imprime 99
```

### 🔍 Lo más destacado

- Evitamos repetir código creando métodos reutilizables como `imprimirArray(int[] array)`.
- Aprendimos a generar arrays de tamaño dinámico utilizando `Scanner` para pedirle al usuario cuántos elementos desea ingresar.
- Introducimos la clase `Random` para generar valores aleatorios.

### ✅ Conclusión

Los arrays permiten **gestionar colecciones de datos** de manera ordenada y eficiente. Son el primer paso para entender estructuras más complejas como listas, pilas o colas.

---

## 🔄 Parte 2: Recursividad vs Iteración

### 🔁 ¿Qué es la iteración?

La **iteración** consiste en repetir un bloque de código mediante estructuras como `for`, `while` o `do...while`. Es un enfoque directo y eficiente para resolver muchos problemas.

### 🔂 ¿Qué es la recursividad?

La **recursividad** implica que un método se llama a sí mismo para resolver un problema. Es útil cuando un problema puede dividirse en subproblemas más pequeños del mismo tipo.

### 🎯 Objetivo de esta sección

- Comprender las diferencias conceptuales entre recursividad e iteración.
- Implementar funciones matemáticas clásicas (factorial y Fibonacci) con ambos enfoques.
- Analizar ventajas y desventajas de cada uno.

### 📦 Implementaciones desarrolladas

#### ➕ Factorial

```java
// Iterativo
int factorialIterativo(int n) {
    int resultado = 1;
    for (int i = 1; i <= n; i++) {
        resultado *= i;
    }
    return resultado;
}

// Recursivo
int factorialRecursivo(int n) {
    if (n == 0) return 1;
    return n * factorialRecursivo(n - 1);
}
```

#### ➗ Fibonacci

```java
// Iterativo
int fibonacciIterativo(int n) {
    if (n <= 1) return n;
    int a = 0, b = 1;
    for (int i = 2; i <= n; i++) {
        int temp = a + b;
        a = b;
        b = temp;
    }
    return b;
}

// Recursivo
int fibonacciRecursivo(int n) {
    if (n <= 1) return n;
    return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
}
```

### 📊 Comparación

| Criterio        | Recursividad            | Iteración               |
|-----------------|--------------------------|--------------------------|
| Legibilidad     | Más elegante y concisa   | Más explícita y clara    |
| Rendimiento     | Menor (por llamadas)     | Mayor (uso de bucles)    |
| Riesgo de error | StackOverflow            | Menor                    |

### ✅ Conclusión

Ambos enfoques son válidos. La elección depende del problema, la eficiencia esperada y la claridad que se desea en el código. Conocer ambos permite mayor flexibilidad y creatividad al programar.

---

## 🔍 Parte 3: Recursividad + Arrays

### 🧩 ¿Qué es la búsqueda binaria?

Es un algoritmo que permite buscar un elemento en un array **ordenado** dividiendo el espacio de búsqueda en mitades sucesivas. Es mucho más eficiente que buscar uno por uno.

### 🎯 Objetivo

- Aplicar recursividad para resolver un problema sobre arrays.
- Entender cómo dividir un problema en subproblemas más pequeños.
- Consolidar los conocimientos sobre arrays y recursividad.

### 🔎 Código de búsqueda binaria recursiva

```java
int busquedaBinaria(int[] array, int inicio, int fin, int objetivo) {
    if (inicio > fin) return -1; // No se encontró el número
    int medio = (inicio + fin) / 2;
    if (array[medio] == objetivo) return medio;
    if (objetivo < array[medio]) {
        return busquedaBinaria(array, inicio, medio - 1, objetivo);
    } else {
        return busquedaBinaria(array, medio + 1, fin, objetivo);
    }
}
```

### 📌 Consideraciones

- El array debe estar ordenado previamente.
- La eficiencia del algoritmo es **O(log n)**, mucho mejor que la búsqueda secuencial (**O(n)**).
- La implementación recursiva es clara, pero también se puede hacer iterativa.

### ✅ Conclusión

La recursividad se puede aplicar no solo a funciones matemáticas, sino también a algoritmos más avanzados como búsquedas, recorridos de estructuras, etc. Esto abre las puertas a resolver problemas más complejos con elegancia.

---

## ✅ Conclusión general

Este proyecto integrador permite afianzar tres pilares de la programación:

- 🔢 **Manejo de arrays**, para almacenar y manipular datos en grupo.
- 🔄 **Comprensión de recursividad e iteración**, aprendiendo cuándo y cómo usar cada técnica.
- 🧠 **Resolución de problemas reales** como búsqueda binaria, factorial o Fibonacci.

Además, se pone en práctica el diseño modular del código, la reutilización de funciones, la entrada de datos con `Scanner` y el análisis de la eficiencia de los algoritmos.

> 💡 **Siguiente paso sugerido:** explorar estructuras dinámicas como `ArrayList`, o conceptos como recursividad con árboles.