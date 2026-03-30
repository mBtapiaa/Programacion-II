import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }

    public boolean validaNumero(int n) {
        return n >= 0 && n <= 10;
    }

    public void juega() {

        reiniciaPartida();
        numeroAAdivinar = (int)(Math.random() * 11);

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (!validaNumero(n)) continue;

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
