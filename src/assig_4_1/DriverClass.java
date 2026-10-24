package assig_4_1;

public class DriverClass {
    public static void main(String[] args) {
        Parent p=new Parent();
        p.showParent();
        Child c=new Child();
        c.showChild();
        c.showParent();
    }
}
