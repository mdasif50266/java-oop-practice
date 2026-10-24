package assig_3_4;

public class Book {
    private int bookId;
    private String title;
    private double price;
    private double disPer;

    public Book() {
        this(1, "unknown", 1.0, 1.0);
    }

    public Book(int bookId, String title) {
        this(bookId, title, 1.0, 0.0);
    }

    public Book(int bookId, String title, double price, double disPer) {
        setBookId(bookId);
        setTitle(title);
        setPrice(price);
        setPer(disPer);
    }

    public void setBookId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Book id cant be zero");
        }
        bookId = id;

    }

    public void setTitle(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("title can't be null");
        }
        title = name;
    }

    public void setPrice(double pri) {
        if (pri <= 0) {
            throw new IllegalArgumentException("price can't be negative or zero");

        }
        price = pri;
    }

    public void setPer(double p) {
        if (p < 0 && p > 100) {
            throw new IllegalArgumentException("per must be between 0 && 100");
        }
        disPer = p;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;

    }

    public double getPrice() {
        return price;
    }

    public double getDisPerI() {
        return disPer;
    }
    public String getBookInfo()
    {
        return "Book id:"+bookId
                +"\nTitle:"+title
                +"\nPrice:"+price
                +"\nDiscount:"+disPer+"%";
    }
    public String getBookInfo(double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            throw new IllegalArgumentException(
                    "Discount must be between 0 and 100"
            );
        }

        double finalPrice =
                price - (price * discountPercentage / 100.0);

        return String.format(
                "%s%nDiscount: %.2f%%%nFinal Price: %.2f",
                getBookInfoWithoutDiscount(),
                discountPercentage,
                finalPrice
        );
    }

    private String getBookInfoWithoutDiscount() {
        return "Book ID: " + bookId
                + "\nTitle: " + title
                + "\nOriginal Price: " + price;
    }
}



