import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }

    public void juega() {

        reiniciaPartida();
        numeroAAdivinar = (int)(Math.random() * 11);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("adivina numero 0-10");
            int n = sc.nextInt();

            if (n == numeroAAdivinar) {
                System.out.println("acertaste");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (n < numeroAAdivinar) System.out.println("mayor");
                    else System.out.println("menor");
                } else {
                    break;
                }
            }
        }
    }
}
