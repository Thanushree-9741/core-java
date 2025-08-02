class Fan {
    private String brand;
    private double price;
    private String color;
    private int speedLevels;
    private boolean isRemoteControl;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeedLevels(int speedLevels) {
        this.speedLevels = speedLevels;
    }

    public void setIsRemoteControl(boolean isRemoteControl) {
        this.isRemoteControl = isRemoteControl;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getSpeedLevels() {
        return speedLevels;
    }

    public boolean getIsRemoteControl() {
        return isRemoteControl;
    }
}
