class Product {
    static int productId = 201;
    static String name = "Mixer";
    static float price = 3500.50f;
    static String brand = "Prestige";
    static int stock = 25;

    public static float totalCost(int quantity) {
        float bill = price * quantity;
        return bill;
    }

    public static boolean isAvailable() {
        boolean avi = stock > 0;
        return avi;
    }

    public static String getBrand() {
        return brand;
    }

    public static String getProductInfo() {
        return name + " by " + brand;
    }

    public static float discountPrice(float discount) {
        float billDiscount = price - discount;
        return billDiscount;
    }
}


