package assig_4_2;

public class BaseClass {
    private void onlyForParent()
    {
        System.out.println("Only accessed by parnet");
    }
    public void exposeparent()
    {
        onlyForParent();
        System.out.println("Now accessible...heppy?");
    }
}
