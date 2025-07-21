class Book {
    private String title;
    private float price;

    public Book() {
        System.out.println("Default constructor - Book");
        this.title = "Default Book";
    }

    public Book(String title) {
        System.out.println("Parameterized constructor - Book");
        this.title = title;
    }

    public Book(String title, float price) {
        System.out.println("2 Parameterized constructor - Book");
        this.title = title;
        this.price = price;
    }

    public void setTitle(String title) { this.title = title; }
    public String getTitle() { return title; }

    public void setPrice(float price) { this.price = price; }
    public float getPrice() { return price; }
}


