
public class ComparacionAlgoritmos {

    public static void main(String[] args) {

        int[] tamanos = {100, 1_000, 5_000, 10_000};

        System.out.println("n\tO(n) ns\tO(n²) ns");

        for (int n : tamanos) {

            // Medición del algoritmo lineal O(n)
            long inicioLineal = System.nanoTime();

            algoritmoLineal(n);

            long finLineal = System.nanoTime();
            long tiempoLineal = finLineal - inicioLineal;

            // Medición del algoritmo cuadrático O(n²)
            long inicioCuadratico = System.nanoTime();

            algoritmoCuadratico(n);

            long finCuadratico = System.nanoTime();
            long tiempoCuadratico = finCuadratico - inicioCuadratico;

            // Mostrar resultados
            System.out.println(
                n + "\t" + tiempoLineal + "\t" + tiempoCuadratico
            );
        }
    }

    // Algoritmo de complejidad lineal O(n)
    public static long algoritmoLineal(int n) {

        long contador = 0;

        for (int i = 0; i < n; i++) {
            contador++;
        }

        return contador;
    }

    // Algoritmo de complejidad cuadrática O(n²)
    public static long algoritmoCuadratico(int n) {

        long contador = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                contador++;
            }
        }

        return contador;
    }
}

