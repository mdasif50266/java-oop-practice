package Student_record_02;

public class StudentDriver {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.set(88,"Md Asif",9);
        System.out.println("Asif details.."+s1.getRoll()+" "+s1.getname()+ " "+s1.getCgpa());
        Student s2=new Student();
        s2.set(89,"Irfan",8);
        System.out.println("Irfan deyails..."+s2.getname()+" "+s2.getRoll()+" "+s2.getCgpa());
    }
}
