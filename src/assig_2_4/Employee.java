package assig_2_4;

public class Employee {
    String name;
    int id;
    double salary;
    static int count;
    public Employee(int id,double salary,String name)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        count++;
    }


}
