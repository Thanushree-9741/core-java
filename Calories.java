class Calories {
    static int[] calorieId = {1, 2, 3, 4, 5};
    static float[] weightInGrams = {100.5f, 200.0f, 150.3f, 180.6f, 120.2f};
    static long[] totalCalories = {450L, 700L, 520L, 600L, 480L};
    static double[] calPerGram = {4.5, 3.5, 3.8, 3.3, 4.0};
    static byte[] foodRating = {5, 4, 3, 4, 5};
    static short[] fatPercent = {10, 15, 12, 11, 14};
    static boolean[] isHealthy = {true, true, false, true, false};
    static boolean[] isVegetarian = {true, true, true, false, true};
    static char[] foodType = {'V', 'V', 'N', 'V', 'V'};
    static String[] foodName = {"Rice", "Paneer", "Chicken", "Veg Roll", "Salad"};

    public static int[] getCalorieId() { 
        return calorieId; 
    }

    public static float[] getWeightInGrams() { 
        return weightInGrams;
     }

    public static long[] getTotalCalories() { 
        return totalCalories;
     }

    public static double[] getCalPerGram() { 
        return calPerGram;
     }

    public static byte[] getFoodRating() {
         return foodRating;
         }

    public static short[] getFatPercent() {
         return fatPercent; 
        }

    public static boolean[] getIsHealthy() {
         return isHealthy;
         }

    public static boolean[] getIsVegetarian() { 
        return isVegetarian; 
    }

    public static char[] getFoodType() { 
        return foodType;
     }

    public static String[] getFoodName() {
         return foodName; 
        }
}
