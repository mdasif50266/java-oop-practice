package circle_area_04;

public class Circles {
    private double radius;
    public void setRadius(double rad)
    {
        if(rad>0)
        {
            radius=rad;
        }
        else
        {
            System.out.println("Enter a valid radius");
        }
    }
    public double getArea()
    {
        return 3.14*radius*radius;
    }
    public double circum()
    {
        return 2*3.14*radius;
    }
}
