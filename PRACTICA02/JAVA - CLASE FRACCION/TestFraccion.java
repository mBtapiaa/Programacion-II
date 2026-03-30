public class TestFraccion {

public static void main(String [] args) {

Fraccion f1 = new Fraccion(1, 4);
Fraccion f2 = new Fraccion(4, 3);

System.out.println("f1 = " + f1);
System.out.println("f2 = " + f2);

System.out.println("suma = " + f1.suma(f2));
System.out.println("resta = " + f1.resta(f2));
System.out.println("multiplica = " + f1.multiplica(f2));
System.out.println("divide = " + f1.divide(f2));
System.out.println("decimal = " + f1.convertirADecimal());
System.out.println("inverso = " + f1.esInverso(f2));

Fraccion f3 = Fraccion.parseFraccion("-2/3");
System.out.println("parse = " + f3);

System.out.println("simplificada = " + new Fraccion(2,8).simplifica());
}
}
