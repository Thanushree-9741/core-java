class Car {
    private String brand;
    private int price;

    public Car() {
        System.out.println("Default constructor - Car");
        this.brand = "Toyota";
    }

    public Car(String brand) {
        System.out.println("Parameterized constructor - Car");
        this.brand = brand;
    }

    public Car(String brand, int price) {
        System.out.println("2 Parameterized constructor - Car");
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
