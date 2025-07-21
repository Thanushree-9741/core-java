class Car {
    static String brand = "Hyundai";
    static String model = "i20";
    static float price = 900000.0f;
    static String color = "Red";
    static int year = 2023;

    public static String getCarInfo() {
        return brand + " " + model;
    }

    public static boolean isNewModel() {
        return year >= 2022;
    }

    public static float onRoadPrice(float tax) {
        
        return price + tax;
    }

    public static String getColor() {
        return color;
    }

    public static String carEmail() {
        return model.toLowerCase() + "@cars.com";
    }
}


