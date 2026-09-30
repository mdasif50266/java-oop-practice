package employee_saleries_05;

import java.util.Scanner;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1=new Employee();
        Scanner p=new Scanner(System.in);
        e1.setSalary(6325);
        System.out.print("Enter percentage :");
        double per=p.nextDouble();
        e1.raiseSalary(per);
        System.out.println("Updated salary is : "+e1.updateSalary());
    }
}
