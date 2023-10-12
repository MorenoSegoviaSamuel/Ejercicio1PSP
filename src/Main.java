
public class Main {
    public static void main(String[] args) {

        long inicio = System.nanoTime();

        int[] arrayNumeros = new int[100];
        Utilidades.rellenarConNumerosAleatorios(arrayNumeros);

        for (int numero : arrayNumeros) {
            Utilidades.Naive(numero);
            System.out.println(numero);
        }
        long fin = System.nanoTime();
        long tiempoNano = fin - inicio;
        long tiempoMili = tiempoNano / 1_000_000;
        long tiempoSeg = tiempoNano / 1_000_000_000;
        System.out.println("|Tiempo transcurrido|");
        System.out.println("En nanosegundos "+tiempoNano);
        System.out.println("En milisegundos "+tiempoMili);
        System.out.println("En segundos "+tiempoSeg);
    }
}
