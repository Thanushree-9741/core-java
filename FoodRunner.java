class FoodRunner {
    public static void main(String[] args) {
        int[] ids = Food.getFoodId();
        for (int id : ids) {
            System.out.println("Food ID: " + id);
        }

        float[] prices = Food.getPrice();
        for (float p : prices) {
            System.out.println("Price: " + p);
        }

        long[] sold = Food.getSoldQuantity();
        for (long s : sold) {
            System.out.println("Sold Quantity: " + s);
        }

        double[] discounts = Food.getDiscount();
        double sum = 0;
        for (double d : discounts) {
            System.out.println("Discount: " + d);
            sum += d;
        }
        float avg = (float) sum / discounts.length;
        System.out.println("Average Discount: " + avg);

        byte[] ratings = Food.getTasteRating();
        for (byte r : ratings) {
            System.out.println("Taste Rating: " + r);
        }

        short[] spice = Food.getSpiciness();
        for (short s : spice) {
            System.out.println("Spiciness: " + s);
        }

        boolean[] available = Food.getIsAvailable();
        for (boolean a : available) {
            System.out.println("Available: " + a);
        }

        char[] cat = Food.getCategory();
        for (char c : cat) {
            System.out.println("Category: " + c);
        }

        String[] items = Food.getItemName();
        for (String name : items) {
            System.out.println("Item Name: " + name);
        }
    }
}
