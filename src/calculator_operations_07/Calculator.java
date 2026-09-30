package calculator_operations_07;

public class Calculator {
    int a;
    int b;
    public int add(int a,int b)
    {
        this.a=a;
        this.b=b;
        return a+b;
    }
    public int sub(int a,int b)
    {
        this.a=a;
        this.b=b;
        return a-b;
    }
    public int mul(int a,int b)
    {
        this.a=a;
        this.b=b;
        return a*b;
    }
    public int div(int a ,int b)
    {
        this.a=a;
        this.b=b;
        return a/b;
    }
    public void show(int a,int b)
    {
        System.out.println("Addition of "+a+" & " +b+" is : "+add(a,b));
        System.out.println("Subtraction of "+a+" & " +b+" is : "+sub(a,b));
        System.out.println("Multipication of "+a+" & " +b+" is : "+mul(a,b));
        System.out.println("Divison of "+a+" & " +b+" is : "+div(a,b));

    }
}
