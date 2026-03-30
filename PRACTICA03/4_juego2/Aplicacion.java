public class Aplicacion {

    public static void main(String[] args) {

        JuegoAdivinaNumero j1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar j2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar j3 = new JuegoAdivinaImpar(3);

        j1.juega();
        j2.juega();
        j3.juega();
    }
}
