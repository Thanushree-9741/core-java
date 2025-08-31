class InheritanceDemo {
    public static void main(String[] args) {
        Car1 car = new Car1("Honda", 180, 4);
        car.start();
        car.display();
        car.stop();

        System.out.println();

        Bike1 bike = new Bike1("Yamaha", 120, "Sports");
        bike.start();
        bike.display();
        bike.stop();

        System.out.println();

        Bus1 bus = new Bus1("Volvo", 100, 50);
        bus.start();
        bus.display();
        bus.stop();
    }
}
