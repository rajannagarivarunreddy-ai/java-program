public class Constructor {
    public static void main(String[] a) {
        Book b = new Book();
        System.out.println(b.title);
    }
}
class Book {
    String title;
    Book() {title = "Untitled";}
}