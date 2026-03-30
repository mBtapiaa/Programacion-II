public class Juego {

    protected int numeroDeVidas;
    protected int record;

    public Juego(int vidas) {
        numeroDeVidas = vidas;
        record = 0;
    }

    public void reiniciaPartida() {
        numeroDeVidas = 3;
    }

    public void actualizaRecord() {
        record++;
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        return numeroDeVidas > 0;
    }
}
