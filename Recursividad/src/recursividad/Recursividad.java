package recursividad;

public class Recursividad {

    public static void main(String[] args) {

        //INTRODUCCIÓN
        System.out.print(
                "=== Recursividad vs Iteración === \n" +
                "La recursividad es cuando una función se llama a sí misma para resolver un problema. \n" +
                "La iteración utiliza bucles (for, while) para repetir operaciones. \n\n");
        
        //FACTORIAL
        System.out.println("=== Factorial de 6 ===");
        System.out.println("Iterativo: " + factorialIterativo(6));
        System.out.println("Recursivo: " + factorialRecursivo(6));
        System.out.println();
        
        //FIBONACCI
        System.out.println("=== Fibonacci de 10 ===");
        System.out.println("Iterativo: " + fibonacciIterativo(10));
        System.out.println("Recursivo: " + fibonacciRecursivo(10));
        System.out.println();
    }
    
    //FUNCIONES 
    // --- FACTORIAL ---
    public static int factorialIterativo(int numero){
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *=i;
        }
        return resultado;
    }
    
    public static int factorialRecursivo(int numero){
        return numero == 0 ? 1 : numero * factorialRecursivo(numero-1); 
    }
    //Otra forma de Hacerlo:
    /*
    public static int factorialRecursivo(int numero) {
        // Caso base
        if (numero == 0 || numero == 1) {
            return 1;
        }
        // Paso recursivo
        return numero * factorialRecursivo(numero - 1);
    }
    */
    
    
    // --- FIBONACCI ---
    public static int fibonacciIterativo(int numero) {
        if (numero <= 1) return numero;
        int a = 0, b = 1;
        for (int i = 2; i <= numero; i++) {
            int numeroTemporal = a + b;
            a = b;
            b = numeroTemporal;
        }
        return b;
    }

    public static int fibonacciRecursivo(int numero) {
        if (numero <= 1) return numero;
        return fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2);
    }
}
