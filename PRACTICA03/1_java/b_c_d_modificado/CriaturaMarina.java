public class CriaturaMarina {

    protected String nombre;

    public CriaturaMarina(String nombre) {
        this.nombre = nombre;
    }

    public void metodo1 () {
        System.out.println("criatura 1");
    }

    public void metodo2 () {
        System.out.println("criatura 2");
    }

    public String toString () {
        return "habita en el oceano: " + nombre;
    }
}
