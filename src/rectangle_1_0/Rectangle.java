package rectangle_1_0;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public float perimeter()
    {
        return 2*(length+width);
    }
    public float area()
    {
        return length*width;
    }
    public boolean isAreaSame(Rectangle r)
    {
        return this.area()==r.area();
    }
}
