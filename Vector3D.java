package guia3;

public class Vector3D
{
    private double x;
    private double y;
    private double z;

    public Vector3D() { // constructor que pone a todos los valores en 0
        this(0,0,0);
    }

    public Vector3D(double x, double y, double z) { // contructor que establece los valores indicados por el usuario
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() { //Retorna el valor de X
        return this.x;
    }

    public double getY() { //Retorna el valor de Y
        return this.y;
    }

    public double getZ() { //Retorna el valor de Z
        return this.z;
    }

    public Vector3D add(Vector3D a) { //Suma el vector3d This con el vector3d a
        Vector3D nuevo = new Vector3D();
        nuevo.x = (this.x + a.x);
        nuevo.y = (this.y + a.y);
        nuevo.z = (this.z + a.z);
        return nuevo;
    }

    public double dotProduct(Vector3D a) //Multiplica el Vector3D this con el Vector3D a
    {
        double nuevo = ((this.x * a.x) + (this.y * a.y) + (this.z * a.z));
        return nuevo;
    }
}
