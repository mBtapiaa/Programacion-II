import java.util.Scanner;

public class TestEstadistica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.print("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = input.nextDouble();
        }

        Estadistica est = new Estadistica(numeros);

        System.out.printf("El promedio es %.2f%n", est.promedio());
        System.out.printf("La desviación estandard es %.5f%n", est.desviacion());

        input.close();
    }
}
