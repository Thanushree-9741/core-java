class Food {
    static int[] foodId = {11, 12, 13, 14, 15};
    static float[] price = {150.5f, 120.0f, 99.9f, 200.0f, 180.5f};
    static long[] soldQuantity = {1000L, 2000L, 1500L, 1800L, 1300L};
    static double[] discount = {5.5, 10.0, 15.0, 12.5, 8.0};
    static byte[] tasteRating = {4, 5, 3, 4, 4};
    static short[] spiciness = {3, 4, 2, 5, 3};
    static boolean[] isAvailable = {true, false, true, true, true};
    static char[] category = {'V', 'V', 'N', 'V', 'N'};
    static String[] itemName = {"Masala Dosa", "Idli", "Chicken Biryani", "Chapati", "Fish Fry"};

    public static int[] getFoodId() { 
        return foodId; 
    }
    public static float[] getPrice() { 
        return price; 
    }
    public static long[] getSoldQuantity() {
         return soldQuantity; }
    public static double[] getDiscount() { return discount;
     }
    public static byte[] getTasteRating() { 
        return tasteRating;
     }
    public static short[] getSpiciness() { 
        return spiciness;
     }
    public static boolean[] getIsAvailable() {
         return isAvailable;
         }
    public static char[] getCategory() { 
        return category;
     }
    public static String[] getItemName() { 
        return itemName;
     }
}
