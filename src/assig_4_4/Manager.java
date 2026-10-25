package assig_4_4;

public class Manager extends Employee{
    public Manager()
    {
        System.out.println("Manager's : zero argument constuctor");
    }
    public Manager(String name)
    {
        super(name);
        System.out.println("Manager's: One argument constructor");
    }
    public Manager(String name,int age)
    {
        super(name,age);
        System.out.println("Manager's : Two argument constructor");
    }
}
