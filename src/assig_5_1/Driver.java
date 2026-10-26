package assig_5_1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Circle c=new Circle(25.35);
        System.out.println("Circle Area : "+c.getArea());
        Triangle t=new Triangle(23.54,36.87);
        System.out.println("Triangle area : "+t.getArea());
        Rectangle r=new Rectangle(36,87);
        System.out.println("Rectangle area : "+r.getArea());
    }
}
