package chapter13;

public class Triangle extends GeometricObject {
    private double a;
    private double b;
    private double c;

    public Triangle(){
    }

    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return a * b/2;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }
}


