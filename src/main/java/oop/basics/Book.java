package oop.basics;

public class Book {
    private String title;
    private Author author;
    private double price;
    private int quantity;

    public Book(String title, Author author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isOutOfStock() {
        return quantity == 0;
    }

    @Override
    public String toString() {
        return "Title:" + this.title  + "\nAuthor:" +
                this.author.getName();
    }

    public static void main(String[] args) {
        Author author1 = new Author("Stephen","stephen@gmail.com", 'M' );
        Book book = new Book("It", author1, 35000, 10);

        System.out.println(book.isOutOfStock());
        System.out.println(book);
    }
}
