package Student_record_02;

public class Student {
    private int roll;
    private String name;
    private double cgpa;
    public void set(int roll,String name,double cgpa) {
        this.roll = roll;
        this.name = name;
        if (cgpa > 0 && cgpa <= 10) {
            this.cgpa = cgpa;
        } else {
            System.out.println("enter valid cgpa");
        }
    }
    public int getRoll()
        {
            return roll;
        }
        public String getname()
        {
            return name;
        }
        public double getCgpa()
        {
            return cgpa;
        }
}
