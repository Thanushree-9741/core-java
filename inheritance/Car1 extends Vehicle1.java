class Car extends Vehicle {    int doors;    Car1(String brand, int speed, int doors) {        super(brand, speed);  // calling parent constructor        this.doors = doors;        System.out.println("Car constructor called for " + this.brand);    }    void display() {        System.out.println("Car Brand: " + this.brand + ", Speed: " + this.speed + " km/h, Doors: " + this.doors);    }}class Food {
    Food() {
        System.out.println("Food constructor called");
    }
}

class Fruit extends Food {
    Fruit() {
        super(); // calls Food constructor
        System.out.println("Fruit constructor called");
    }
}

class SingleLevelExample {
    public static void main(String args[]) {
        Fruit f = new Fruit();
    }
}
