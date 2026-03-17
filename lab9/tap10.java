public class tap10 {

    class Book {

        String title;

        Book(String title) {
            this.title = title;
        }

        void show() {
            System.out.println("Book: " + title);
        }
    }

    public static void main(String[] args) {

        Tap_10 l = new Tap_10();
        Book b = l.new Book("Java Programming");

        b.show();
    }
}