public class Delfin extends Mamifero {

    public Delfin(String nombre) {
        super(nombre);
    }

    public void metodo1 () {
        System.out.println("sopla burbujas");
        super.metodo1();
    }

    public String toString () {
        return "delfin: " + nombre;
    }
}
