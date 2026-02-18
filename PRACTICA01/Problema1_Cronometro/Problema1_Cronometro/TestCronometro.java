import java.util.Random;

public class TestCronometro {
    public static void main(String[] args) {
        int[] numeros = new int[100000];
        Random rand = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100000);
        }

        Cronometro crono = new Cronometro();
        crono.iniciar();
        ordenacionSeleccion(numeros);
        crono.detener();

        System.out.println("Tiempo de ordenación de 100,000 números: " 
                           + crono.lapsoDeTiempo() + " milisegundos");
    }

    public static void ordenacionSeleccion(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
