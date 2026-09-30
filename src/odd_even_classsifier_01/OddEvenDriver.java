package odd_even_classsifier_01;

public class OddEvenDriver {
    public boolean isOdd(int x)
    {
        if(x%2!=0)
        {
            return true;
        }
        else return false;
    }
    public String describe(int x)
    {
        if(x%2!=0)
        {
            return x+" is oddd";
        }
        return x+" is even";
    }

}
