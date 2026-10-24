package assig_4_3;

public class Employee extends Person{
    int empId=3;
    String designation="Supervisor";
    public void displayEmployee()
    {
        System.out.println("EmpId is : "+empId);
        System.out.println("Designation is : "+designation);
    }
}
