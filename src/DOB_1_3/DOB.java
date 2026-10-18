package DOB_1_3;

public class DOB {
    private int day;
    private int month;
    private int year;
    private String name;
    public DOB(int day,int month,int year,String name)
    {
        this.day=day;
        this.month=month;
        this.year=year;
        this.name=name;
    }
    public void show()
    {
        System.out.println(name+" age is : "+day+"/"+month+"/"+year);
    }
    public int findAgeDifference(DOB p)
    {
       return Math.abs(this.year-p.year);
    }
}
