public class BookRunner {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        Book b1 = new Book();
        b1.setTitle("Wings of Fire");
        b1.setAuthor("Dr. A.P.J Abdul Kalam");
        b1.setPages(180);
        b1.setPrice(199.0);
        b1.setPublisher("Universities Press");
        books[0] = b1;

        Book b2 = new Book();
        b2.setTitle("The Alchemist");
        b2.setAuthor("Paulo Coelho");
        b2.setPages(208);
        b2.setPrice(299.0);
        b2.setPublisher("HarperCollins");
        books[1] = b2;

        Book b3 = new Book();
        b3.setTitle("You Can Win");
        b3.setAuthor("Shiv Khera");
        b3.setPages(220);
        b3.setPrice(250.0);
        b3.setPublisher("Macmillan");
        books[2] = b3;

        Book b4 = new Book();
        b4.setTitle("Think and Grow Rich");
        b4.setAuthor("Napoleon Hill");
        b4.setPages(280);
        b4.setPrice(320.0);
        b4.setPublisher("Rohan Book Company");
        books[3] = b4;

        Book b5 = new Book();
        b5.setTitle("Zero to One");
        b5.setAuthor("Peter Thiel");
        b5.setPages(210);
        b5.setPrice(350.0);
        b5.setPublisher("Penguin Books");
        books[4] = b5;

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + (i + 1) + " Details:");
            Book bk = books[i];
            System.out.println("Title: " + bk.getTitle());
            System.out.println("Author: " + bk.getAuthor());
            System.out.println("Pages: " + bk.getPages());
            System.out.println("Price: ₹" + bk.getPrice());
            System.out.println("Publisher: " + bk.getPublisher());
            System.out.println("----------------------------------");
        }
    }
}
