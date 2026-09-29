import java.util.Scanner;
public  class OddEvenClassifier
{
    public static void main(String[] args) {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter any number");
        int x=p.nextInt();
        System.out.println(isOdd(x));
        System.out.println(describe(x));


    }
    public static boolean isOdd(int x)
    {
        if(x%2!=0)
        {
            return true;
        }
        return false;
    }
    public static String describe(int x)
    {
        String s;
        String t;
        if(x%2!=0)
        {
             s=x+" is odd";
            return s;
        }
          t=x+" is even";
        return t;
    }
}