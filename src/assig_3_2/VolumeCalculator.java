package assig_3_2;

public class VolumeCalculator {
    public static double volume(double r)
    {
        return (4/3)*(22/7)*r*r*r;
    }
     static double volume(double h,double r)
    {
        return (22/7)*r*r*h;
    }
     static double volume(double l,double b,double h)
    {
        return l*b*h;
    }

}
