class CarRunner {
    public static void main(String[] args) {
        System.out.println("Brand: " + Car.brand);
        System.out.println("Model: " + Car.model);
        System.out.println("Price: " + Car.price);
        System.out.println("Color: " + Car.color);
        System.out.println("Year: " + Car.year);

        System.out.println(Car.getCarInfo());
        System.out.println("New Model? " + Car.isNewModel());
        System.out.println("On-Road Price: " + Car.onRoadPrice(85000));
        System.out.println("Color: " + Car.getColor());
        System.out.println("Car Email: " + Car.carEmail());
    }
}