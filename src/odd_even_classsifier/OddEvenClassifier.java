package odd_even_classsifier;

import java.util.Scanner;
public  class OddEvenClassifier {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter any number");
        int x = p.nextInt();
        OddEvenDriver d=new OddEvenDriver();
        System.out.println(d.isOdd(x));
        System.out.println(d.describe(x));


    }
}