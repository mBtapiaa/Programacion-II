public class Calamar extends CriaturaMarina {

    public Calamar(String nombre) {
        super(nombre);
    }

    public void metodo2 () {
        System.out.println("tentaculos");
    }

    public String toString () {
        return "calamar: " + nombre;
    }
}
