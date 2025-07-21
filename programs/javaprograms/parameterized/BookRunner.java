class BookRunner {
    public static void main(String[] args) {
        System.out.println("\nBook Title & Price:");

        Book b1 = new Book();
        System.out.println(b1.getTitle() + " - ₹" + b1.getPrice());

        Book b2 = new Book("Java Programming");
        System.out.println(b2.getTitle() + " - ₹" + b2.getPrice());

        Book b3 = new Book("Python Basics", 499.99f);
        System.out.println(b3.getTitle() + " - ₹" + b3.getPrice());

        Book b4 = new Book("C++ Guide", 399.99f);
        System.out.println(b4.getTitle() + " - ₹" + b4.getPrice());

        Book b5 = new Book("HTML & CSS");
        System.out.println(b5.getTitle() + " - ₹" + b5.getPrice());

        Book b6 = new Book();
        System.out.println(b6.getTitle() + " - ₹" + b6.getPrice());

        Book b7 = new Book("Spring Boot", 599.99f);
        System.out.println(b7.getTitle() + " - ₹" + b7.getPrice());

        Book b8 = new Book("ReactJS");
        System.out.println(b8.getTitle() + " - ₹" + b8.getPrice());

        Book b9 = new Book("SQL Master", 299.99f);
        System.out.println(b9.getTitle() + " - ₹" + b9.getPrice());

        Book b10 = new Book("JavaScript Essentials", 350.00f);
        System.out.println(b10.getTitle() + " - ₹" + b10.getPrice());
    }
}