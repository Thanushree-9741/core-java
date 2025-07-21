class BookRunner {
    public static void main(String[] args) {
        System.out.println("Title: " + Book.title);
        System.out.println("Author: " + Book.author);
        System.out.println("Pages: " + Book.pages);
        System.out.println("Price: " + Book.price);
        System.out.println("Publisher: " + Book.publisher);

        System.out.println("Thick Book: " + Book.isThick());

        float priceAfterTax = Book.getPriceAfterTax(50);
        System.out.println("Price After Tax: " + priceAfterTax);
        System.out.println(Book.getAuthorInfo());
        System.out.println(Book.getPublisher());
        System.out.println(Book.fullDetails());
    }
}
