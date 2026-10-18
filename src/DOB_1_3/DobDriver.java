package DOB_1_3;

public class DobDriver {
    public static void main(String[] args) {
        DOB p1=new DOB(2,12,2000,"Asif");
        DOB p2=new DOB(30,3,2020,"owias");
        p1.show();
        p2.show();
        System.out.println("Age difference is : "+p1.findAgeDifference(p2));
    }
}
