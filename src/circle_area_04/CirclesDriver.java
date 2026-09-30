package circle_area_04;

import java.util.Scanner;

public class CirclesDriver {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        Circles c=new Circles();
        System.out.println("enter radius");
        double rad=p.nextDouble();
        c.setRadius(rad);
        System.out.println("Area is : "+c.getArea());
        System.out.println("Circum is : "+c.circum());
    }
}
