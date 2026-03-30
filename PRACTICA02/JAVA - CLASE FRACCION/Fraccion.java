public class Fraccion {

private int numerador;
private int denominador;

public Fraccion () {
this.numerador = 0;
this.denominador = 1;
}

public Fraccion(int n, int d) {
this.numerador = n;
this.denominador = d;
}

@Override
public boolean equals(Object o) {
if (o instanceof Fraccion) {
Fraccion f = (Fraccion) o;
return f.numerador == this.numerador && f.denominador == this.denominador;
}
return false;
}

@Override
public String toString () {
return String.format("%d/%d", this.numerador , this.denominador);
}

public Fraccion suma(Fraccion o) {
int n = (this.numerador * o.denominador) + (this.denominador * o.numerador);
int d = this.denominador * o.denominador;
return new Fraccion(n, d);
}

public Fraccion resta(Fraccion o) {
Fraccion c = new Fraccion ();
c.numerador = (this.numerador * o.denominador) - (this.denominador * o.numerador);
c.denominador = this.denominador * o.denominador;
return c;
}

public Fraccion multiplica(Fraccion o){
return new Fraccion(this.numerador*o.numerador,this.denominador*o.denominador);
}

public Fraccion divide(Fraccion o){
return new Fraccion(this.numerador*o.denominador,this.denominador*o.numerador);
}

public double convertirADecimal(){
if(this.denominador==0) return 0;
return (double)this.numerador/this.denominador;
}

public boolean esInverso(Fraccion o){
Fraccion r = this.multiplica(o);
return r.numerador == r.denominador;
}

public static Fraccion parseFraccion(String str){
String[] p = str.split("/");
return new Fraccion(Integer.parseInt(p[0].trim()),Integer.parseInt(p[1].trim()));
}

public Fraccion simplifica(){
int a = Math.abs(this.numerador);
int b = Math.abs(this.denominador);
while(b!=0){
int t=b;
b=a%b;
a=t;
}
return new Fraccion(this.numerador/a,this.denominador/a);
}
}
