package assig_3_1;

public class Rectangle {
    private int length;
    private int breadth;
    public Rectangle()
    {
        length=0;
        breadth=0;
    }
    public Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public Rectangle(int n)
    {
        length=n;
        breadth=n;
    }
    public  int getArea()
    {
        return length*breadth;
    }


}
