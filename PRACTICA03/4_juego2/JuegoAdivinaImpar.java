public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

    public JuegoAdivinaImpar(int vidas) {
        super(vidas);
    }

    public boolean validaNumero(int n) {
        if (n < 0 || n > 10) return false;
        if (n % 2 == 0) {
            System.out.println("error");
            return false;
        }
        return true;
    }
}
