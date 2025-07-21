class Restaurant {
    private String name;
    private String location;
    private String cuisine;
    private int seats;

    public static String category;

    static {
        category = "Food Service";
        System.out.println("Static Block in Restaurant");
    }

    {
        System.out.println("Non-Static Block in Restaurant");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }
}
