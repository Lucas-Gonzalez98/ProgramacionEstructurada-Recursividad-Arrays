
package arrays;

import java.util.Random;
import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        System.out.print(
            "=== Arrays ===\n" +
            "Un array es una estructura que almacena múltiples valores del mismo tipo.\n" +
            "Tiene un tamaño fijo una vez que se crea.\n\n"
        );

        // === Array de enteros ===
        int[] numerosEnteros = {10, 20, 30, 40};
        System.out.println("Array de enteros:");
        imprimirArrayEntero(numerosEnteros);
        System.out.println("Mostramos cada elemento con su índice:");
        for (int i = 0; i < numerosEnteros.length; i++) {
            System.out.println("Elemento en [" + i + "] = " + numerosEnteros[i]);
        }

        // Acceder a un solo elemento
        System.out.println("\nAccedemos al segundo elemento (posición 1): " + numerosEnteros[1]);

        // Modificar un elemento
        numerosEnteros[1] = 77;
        System.out.println("Modificamos el segundo elemento a 77:");
        System.out.println("Nuevo array de enteros");
        imprimirArrayEntero(numerosEnteros);

        // === Array de decimales (double) ===
        double[] numerosDecimales = {3.14, 2.71, 1.41};
        System.out.println("\nArray de decimales:");
        imprimirArrayDouble(numerosDecimales);
        System.out.println("Mostramos cada elemento con su índice:");
        for (int i = 0; i < numerosDecimales.length; i++) {
            System.out.println("Elemento en [" + i + "] = " + numerosDecimales[i]);
        }

        // === Array de caracteres (char) ===
        char[] letras = {'A', 'B', 'C', 'D'};
        System.out.println("\nArray de caracteres:");
        imprimirArrayChar(letras);
        System.out.println("Mostramos cada elemento con su índice:");
        for (int i = 0; i < letras.length; i++) {
            System.out.println("Elemento en [" + i + "] = " + letras[i]);
        }

        // === Array de cadenas de texto (String) ===
        String[] nombres = {"Ana", "Luis", "Carlos"};
        System.out.println("\nArray de Strings:");
        imprimirArrayString(nombres);
        System.out.println("Mostramos cada elemento con su índice:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Elemento en [" + i + "] = " + nombres[i]);
        }

        // === Array de valores booleanos ===
        boolean[] respuestas = {true, false, true};
        System.out.println("\nArray de booleanos:");
        imprimirArrayBoolean(respuestas);
        System.out.println("Mostramos cada elemento con su índice:");
        for (int i = 0; i < respuestas.length; i++) {
            System.out.println("Elemento en [" + i + "] = " + respuestas[i]);
        }
        
        // === INTERACTIVIDAD: Crear array dinámico con números aleatorios ===
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("\n=== Crear un array de enteros aleatorios ===\n");
        System.out.print("¿Cuántos elementos querés en el array? ");
        int cantidad = scanner.nextInt();

        int[] arrayAleatorio = new int[cantidad];

        // Rellenar con valores aleatorios entre 1 y 100
        for (int i = 0; i < arrayAleatorio.length; i++) {
            arrayAleatorio[i] = random.nextInt(100) + 1; // Números entre 1 y 100
        }

        // Mostrar el array generado
        System.out.println("\nArray generado con números aleatorios:");
        leerArrays(arrayAleatorio);

        // === CONCLUSIÓN ===
        System.out.print(
            "\n\n\n=== Conclusión ===\n" +
            "Los arrays permiten agrupar datos del mismo tipo.\n" +
            "Podés acceder y modificar valores usando el índice.\n" +
            "También podés crear arrays dinámicamente y llenarlos con datos generados.\n"
        );
    }
    
    //FUNCION PARA RECORRER ARRAYS TIPO ENTERO REUTILIZABLE
    public static void leerArrays(int[] array){
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }
    }
    
    
    
    //FUNCIONES PARA MOSTRAR TODOS LOS TIPOS DE ARRAYS
    public static void imprimirArrayEntero(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void imprimirArrayDouble(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void imprimirArrayChar(char[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print("'" + array[i] + "'");
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void imprimirArrayString(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\"" + array[i] + "\"");
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void imprimirArrayBoolean(boolean[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
    
    
}
