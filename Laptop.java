class Laptop {
    private String brand;
    private String model;
    private double price;
    private int ramSize; // in GB
    private String processor;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public int getRamSize() {
        return ramSize;
    }
    public String getProcessor() {
        return processor;
    }
}
