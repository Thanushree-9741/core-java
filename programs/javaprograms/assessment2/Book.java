class Book {
    static String title = "Wings of Fire";
    static String author = "APJ Abdul Kalam";
    static int pages = 250;
    static float price = 300.0f;
    static String publisher = "Universities Press";

    public static boolean isThick() {
        return pages > 200;
    }

    public static float getPriceAfterTax(float tax) {
        float priceAfterTax = price + tax;
        return priceAfterTax;
    }

    public static String getAuthorInfo() {
        return  author;
    }

    public static String getPublisher() {
        return publisher;
    }

    public static String fullDetails() {
        return title + " by " + author + ", published by " + publisher;
    }
}

