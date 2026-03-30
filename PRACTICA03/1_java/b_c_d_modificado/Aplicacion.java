public class Aplicacion {

    public static void main(String [] args) {

        CriaturaMarina [] elementos = {
            new Calamar("cali"),
            new Delfin("flipper"),
            new Mamifero("mami"),
            new CriaturaMarina("criatura"),
            new Ballena("balli")
        };

        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
            elementos[i].metodo1();
            elementos[i].metodo2();
            System.out.println();
        }
    }
}
