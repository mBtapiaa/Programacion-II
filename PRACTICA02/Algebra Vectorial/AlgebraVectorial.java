public class AlgebraVectorial {

private double[] a;
private double[] b;

public AlgebraVectorial(double[] a,double[] b){
this.a=a;
this.b=b;
}

private double modulo(double[] v){
return Math.sqrt(v[0]*v[0]+v[1]*v[1]+v[2]*v[2]);
}

private double productoPunto(double[] x,double[] y){
return x[0]*y[0]+x[1]*y[1]+x[2]*y[2];
}

private double[] suma(double[] x,double[] y){
return new double[]{x[0]+y[0],x[1]+y[1],x[2]+y[2]};
}

private double[] resta(double[] x,double[] y){
return new double[]{x[0]-y[0],x[1]-y[1],x[2]-y[2]};
}

private double[] cruz(double[] x,double[] y){
return new double[]{
x[1]*y[2]-x[2]*y[1],
x[2]*y[0]-x[0]*y[2],
x[0]*y[1]-x[1]*y[0]
};
}

public boolean perpendicular1(){
return modulo(suma(a,b)) == modulo(resta(a,b));
}

public boolean perpendicular2(){
return modulo(resta(a,b)) == modulo(resta(b,a));
}

public boolean perpendicular3(){
return productoPunto(a,b)==0;
}

public boolean perpendicular4(){
return Math.pow(modulo(suma(a,b)),2) == Math.pow(modulo(a),2)+Math.pow(modulo(b),2);
}

public boolean paralela1(){
double r = a[0]/b[0];
return a[1]==r*b[1] && a[2]==r*b[2];
}

public boolean paralela2(){
double[] c = cruz(a,b);
return c[0]==0 && c[1]==0 && c[2]==0;
}

public double[] proyeccion(){
double esc = productoPunto(a,b)/(b[0]*b[0]+b[1]*b[1]+b[2]*b[2]);
return new double[]{esc*b[0],esc*b[1],esc*b[2]};
}

public double componente(){
return productoPunto(a,b)/modulo(b);
}
}
