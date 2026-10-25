package assig_4_4;

public class Employee extends Person{
    public Employee()
    {
        System.out.println("Employee's : zero argument constructor");
    }
    public Employee(String name)
    {
        super(name);
        System.out.println("Employee's : One argument constructor");
    }
    public Employee(String name,int age)
    {
        super(name,age);
        System.out.println("Employee's : Two argument constructor");
    }
}
