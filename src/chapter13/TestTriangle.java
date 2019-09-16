package chapter13;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个边");
        double a = input.nextDouble();
        System.out.println("请输入第二个边");
        double b = input.nextDouble();
        System.out.println("请输入第三个边");
        double c = input.nextDouble();
        System.out.println("请输入颜色");
        String color = input.next();

        Triangle triangle = new Triangle(a,b,c);
        triangle.setColor(color);

        System.out.println(triangle.getArea());
        System.out.println(triangle.getColor());

    }


}
