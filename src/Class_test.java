import org.omg.CORBA.MARSHAL;

public class Class_test {
    public static void main(String[] args) {
        Circle Circle1 = new Circle(1);
        System.out.println(Circle1.getArea());
        System.out.println(Circle1.getPerimeter());

    }
}


class Circle{
    double radius = 1;

    Circle(){

    }
    Circle(double newRadius){
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2* radius*Math.PI;
    }

    void setRadius(double newRaius){
        radius = newRaius;
    }

}
