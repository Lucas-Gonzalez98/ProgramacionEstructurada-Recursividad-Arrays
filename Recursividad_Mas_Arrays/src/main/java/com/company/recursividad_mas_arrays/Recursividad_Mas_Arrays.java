package com.company.recursividad_mas_arrays;

public class Recursividad_Mas_Arrays {

    public static void main(String[] args) {
        
        //CREAMOS UN ARRAYS CON NUMEROS ORDENADOS
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        //ESTE ES EL NUMERO QUE VAMOS A BUSCAR
        int objetivo = 7; // Número a buscar

        System.out.println("=== Búsqueda Binaria ===");
        System.out.println("Arreglo: [1, 3, 5, 7, 9, 11, 13, 15]");
        System.out.println("Buscar 7 de forma recursiva: posición del array (teniendo en cuenta que el primer numero tiene posicion 0)" + busquedaBinariaRecursiva(numeros, objetivo, 0, numeros.length - 1));
    }

    public static int busquedaBinariaRecursiva(int[] array, int objetivo, int inicio, int fin) {

        if (inicio > fin) {
            return -1;
        }

        int medio = (inicio + fin) / 2;

        if (array[medio] == objetivo) {
            return medio; // Si encontramos el número, devolvemos su posición
        } else if (array[medio] < objetivo) {
            return busquedaBinariaRecursiva(array, objetivo, medio + 1, fin); // Buscar en la mitad derecha
        } else {
            return busquedaBinariaRecursiva(array, objetivo, inicio, medio - 1); // Buscar en la mitad izquierda
        }
    }
}
