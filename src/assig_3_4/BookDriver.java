
package assig_3_4;

public class BookDriver {
    public static void main(String[] args) {

        // Object 1: No-argument constructor
        Book b1 = new Book();

        // Update values using setters
        b1.setBookId(101);
        b1.setTitle("Java Programming");
        b1.setPrice(800.0);
        b1.setPer(10.0);

        // Object 2: Constructor with ID and title
        Book b2 = new Book(102, "Data Structures");

        // Update remaining values
        b2.setPrice(1000.0);
        b2.setPer(20.0);

        System.out.println("=== Book 1 ===");
        System.out.println(b1.getBookInfo());

        System.out.println("\n=== Book 1 With Discount ===");
        System.out.println(b1.getBookInfo(15.0));

        System.out.println("\n=== Book 2 ===");
        System.out.println(b2.getBookInfo());

        System.out.println("\n=== Book 2 With Discount ===");
        System.out.println(b2.getBookInfo(25.0));
    }
}
