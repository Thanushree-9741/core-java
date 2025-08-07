class LaptopBill {
    private String buyerName;
    private String brand;
    private double price;
    private String store;

    public LaptopBill() {
        buyerName = "Kiran";
        brand = "Dell";
        price = 55000.0;
        store = "Reliance Digital";
    }

    public LaptopBill(String buyerName) {
        this.buyerName = buyerName;
    }

    public LaptopBill(String buyerName, String brand) {
        this.buyerName = buyerName;
        this.brand = brand;
    }

    public LaptopBill(String buyerName, String brand, double price) {
        this.buyerName = buyerName;
        this.brand = brand;
        this.price = price;
    }

    public LaptopBill(String buyerName, String brand, double price, String store) {
        this.buyerName = buyerName;
        this.brand = brand;
        this.price = price;
        this.store = store;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getStore() {
        return store;
    }
}
