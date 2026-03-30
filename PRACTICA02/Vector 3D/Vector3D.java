public class Vector3D {

double x,y,z;

public Vector3D(double x,double y,double z){
this.x=x;
this.y=y;
this.z=z;
}

public Vector3D suma(Vector3D o){
return new Vector3D(x+o.x,y+o.y,z+o.z);
}

public Vector3D escalar(double r){
return new Vector3D(r*x,r*y,r*z);
}

public double modulo(){
return Math.sqrt(x*x+y*y+z*z);
}

public Vector3D normal(){
double m = modulo();
return new Vector3D(x/m,y/m,z/m);
}

public double punto(Vector3D o){
return x*o.x+y*o.y+z*o.z;
}

public Vector3D cruz(Vector3D o){
return new Vector3D(
y*o.z - z*o.y,
z*o.x - x*o.z,
x*o.y - y*o.x
);
}
}
