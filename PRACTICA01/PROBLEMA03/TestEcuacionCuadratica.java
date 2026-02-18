import java.util.Scanner;

public class TestEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        EcuacionCuadratica ec = new EcuacionCuadratica(a, b, c);
        double disc = ec.getDiscriminante();

        if (disc > 0) {
            System.out.printf("La ecuación tiene dos raíces %f y %f%n", 
                              ec.getRaiz1(), ec.getRaiz2());
        } else if (disc == 0) {
            System.out.printf("La ecuación tiene una raíz %f%n", ec.getRaiz1());
        } else {
            System.out.println("La ecuación no tiene raíces reales");
        }

        input.close();
    }
}
