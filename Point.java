package guia3;
public class Point
{
    private double x;
    private double y;

    public Point() { //Contructor que pone a todo en 0
        this(0,0);
    }

    public Point(double x, double y) {//Contructor que pone a todo en un valor X e Y
        this.x = x;
        this.y = y;
    }

    public double getX() {//muestra el valor de X
        return this.x;
    }

    public double getY() {//muestra el valor de Y
        return this.y;
    }

    public Point add(Point a) {// suma el Point this con el Point a
        Point nuevo = new Point();
        nuevo.x = (this.x + a.x);
        nuevo.y = (this.y + a.y);
        return nuevo;
    }
}
