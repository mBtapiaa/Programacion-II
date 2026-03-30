public class Ballena extends Mamifero {

    public Ballena(String nombre) {
        super(nombre);
    }

    public void metodo1 () {
        System.out.println("canta canciones");
    }

    public String toString () {
        return "ballena: " + nombre;
    }

    public void nadar() {
        System.out.println("nada profundamente");
    }
}
