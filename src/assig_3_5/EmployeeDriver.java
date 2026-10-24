package assig_3_5;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1=new Employee();
        System.out.println(e1);
        e1.raiseSalary(82.3654);
        System.out.println("After increasing.....");
        System.out.println(e1);
        Employee e2=new Employee(2,"Asif");
        System.out.println(e2);
        e2.raiseSalary(25472);
        System.out.println("\nAftetr increasing");
        System.out.println(e2);



    }
}
