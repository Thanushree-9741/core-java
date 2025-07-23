class Pen {
    String penName;
    String colour;
    int price;

    public Pen() {}

    public Pen(String penName) {
        this.penName = penName;
    }

    public Pen(String colour, boolean isColour) {
        this.colour = colour;
    }

    public Pen(int price) {
        this.price = price;
    }

    public Pen(String penName, String colour) {
        this.penName = penName;
        this.colour = colour;
    }

    public Pen(String penName, int price) {
        this.penName = penName;
        this.price = price;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    public String getPenName() {
        return penName;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
