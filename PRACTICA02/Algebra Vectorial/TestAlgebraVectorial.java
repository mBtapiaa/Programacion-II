public class TestAlgebraVectorial {
public static void main(String[] args){

double[] a = {1,2,3};
double[] b = {2,4,6};

AlgebraVectorial av = new AlgebraVectorial(a,b);

System.out.println(av.perpendicular1());
System.out.println(av.perpendicular2());
System.out.println(av.perpendicular3());
System.out.println(av.perpendicular4());

System.out.println(av.paralela1());
System.out.println(av.paralela2());

double[] p = av.proyeccion();
System.out.println(p[0]+" "+p[1]+" "+p[2]);

System.out.println(av.componente());
}
}
