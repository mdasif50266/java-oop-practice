package assig_2_1;

public class RectangleDriver {
    public static void main(String[] args) {
//        Scanner p=new Scanner(System.in);
//        System.out.print("Enter length : ");
//        float len=p.nextFloat();
//        System.out.print("Enter width : ");
//        float bre=p.nextFloat();
//
        Rectangle r1=new Rectangle(2.58f,3.96f);
        Rectangle r2=new Rectangle(2.58f,3.96f);
        System.out.println("R1 perimeter is : "+r1.perimeter());
        System.out.println("R2 perimeter is : "+r2.perimeter());
        System.out.println("R1 area is : "+r1.area());
        System.out.println("R2 area is : "+r2.area());
        System.out.println("IS area is same ? :"+r1.isAreaSame(r2));

    }
}
