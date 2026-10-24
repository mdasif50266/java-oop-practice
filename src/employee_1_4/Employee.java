package employee_1_4;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

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
