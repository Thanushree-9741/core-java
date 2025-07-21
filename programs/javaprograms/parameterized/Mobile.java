class Mobile {
    private String model;
    private int price;

    public Mobile() {
        System.out.println("Default constructor - Mobile");
        this.model = "Default Mobile";
    }

    public Mobile(String model) {
        System.out.println("Parameterized constructor - Mobile");
        this.model = model;
    }

    public Mobile(String model, int price) {
        System.out.println("2 Parameterized constructor - Mobile");
        this.model = model;
        this.price = price;
    }

    public void setModel(String model) { this.model = model; }
    public String getModel() { return model; }

    public void setPrice(int price) { this.price = price; }
    public int getPrice() { return price; }
}


