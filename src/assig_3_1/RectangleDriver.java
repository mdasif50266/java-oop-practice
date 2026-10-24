package assig_3_1;

public class RectangleDriver {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        System.out.println(r1.getArea());
        Rectangle r2=new Rectangle(5,9);
        System.out.println(r2.getArea());
        Rectangle r3=new Rectangle(3);
        System.out.println(r3.getArea());
    }
}
