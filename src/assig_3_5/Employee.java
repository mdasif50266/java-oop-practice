package assig_3_5;

public class Employee {
    private int empId;
    private String name;
    private static double salary;
    public Employee()
    {
        this(1,"unknown",10.3255);
    }
    public Employee(int empId,String name)
    {
     this(empId,name,10254.36);

    }
    public Employee(int empId,String name,double salary)
    {
        setEmpId(empId);
        setName(name);
        setSalary(salary);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        if(empId<=0)
        {
            throw new IllegalArgumentException("id can not be zero or negative");
        }
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.trim().isEmpty())
        {
            throw new IllegalArgumentException("name can not be null");
        }
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0)
        {
            throw new IllegalArgumentException("salary can not be zero");
        }
        this.salary = salary;
    }
    public static double raiseSalary(double per)
    {
        salary+=salary*(per/100);
        return salary;
    }

    public static double raiseSalary(int amt)
    {
        salary+=amt;
        return amt;
    }
    public String toString()
    {
        return "Emp id : "+empId
                +"\nName : "+name
                +"\nSalary : "+salary;
    }
}
