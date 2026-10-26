package assig_5_1;

public class Circle extends Shape{
    double radius;
    public Circle(double radius)
    {
        this.radius=radius;

    }
    @Override
    public double getArea()
    {
        return Math.PI * radius*radius;
    }
}
