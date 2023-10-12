import java.util.Random;

public class Utilidades {
    public static void rellenarConNumerosAleatorios(int[] array) {
        Random rand = new Random();
        int maxValorEntero = Integer.MAX_VALUE;
        int rango = (int) (0.1 * maxValorEntero);

        for (int i = 0; i < array.length; i++) {
            int numeroAleatorio = rand.nextInt(rango + 1); // Genera números aleatorios en el rango de 0 a rango
            array[i] = maxValorEntero - numeroAleatorio; // Resta el número aleatorio del valor máximo
        }
    }



    public static boolean Naive(int numero) {
        // Los números menores o iguales a 1 no son primos
        if (numero <= 1) {
            System.out.println("Número no primo");
            return false;
        }
        // Comprobamos divisibilidad por todos los enteros menores que el número
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println("Número no primo");
                return false; // No es primo si es divisible por algún número menor
            }
        }
        System.out.println("Número primo");
        return true; // Es primo si no se encontró una división exacta
    }
}
