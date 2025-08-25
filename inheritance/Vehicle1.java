class Vehicle1 {
    String brand;
    int speed;

   
    Vehicle1(String brand, int speed) {
        this.brand = brand;   
        this.speed = speed;
        System.out.println("Vehicle constructor called for " + this.brand);
    }

    void start() {
        System.out.println(brand + " is starting at speed " + speed + " km/h.");
    }

    void stop() {
        System.out.println(brand + " is stopping.");
    }
}










