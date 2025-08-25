class VehicleCarBusBikeRunnerClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.honk();
        car.stop();

        System.out.println();

        Bike bike = new Bike();
        bike.start();
        bike.wheelie();
        bike.stop();

        System.out.println();

        Bus bus = new Bus();
        bus.start();
        bus.passengers();
        bus.stop();
    }
}
