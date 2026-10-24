package assig_4_3;

public class Manager extends Employee{
    String department;
    int teamsize;
    public Manager(String dept,int size)
    {
        department=dept;
        teamsize=size;
    }
    public void displayManager()
    {
        System.out.println("Department is : "+department);
        System.out.println("TeamSize is : "+teamsize);
    }
}
