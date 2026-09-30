package calculator_operations_07;

import java.util.Scanner;

public class CalculatorDriver {
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        Calculator c=new Calculator();
        System.out.print("Enter a : ");
        int a=p.nextInt();
        System.out.print("Enter b : ");
        int b=p.nextInt();
        c.show(a,b);
    }
}
