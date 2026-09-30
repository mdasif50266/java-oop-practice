package employee_saleries_05;

public class Employee {
    private String name;
    private double salary;
    public void setSalary(double sal)
    {
        salary+=sal;
    }
    public void raiseSalary(double percent)
    {

        if(percent>0) {
            salary += salary * percent / 100;
        }
    }
    public double updateSalary()
    {
        return salary;
    }

}
