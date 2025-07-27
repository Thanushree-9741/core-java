class Makeup {
    static int[] makeupId = {21, 22, 23, 24, 25};
    static float[] price = {499.9f, 349.0f, 699.0f, 120.0f, 250.5f};
    static long[] unitsSold = {5000L, 3000L, 7000L, 1500L, 2800L};
    static double[] gst = {18.0, 12.0, 18.0, 5.0, 12.0};
    static byte[] qualityRating = {5, 4, 4, 3, 5};
    static short[] quantityMl = {50, 30, 60, 40, 45};
    static boolean[] isBranded = {true, true, false, false, true};
    static char[] productType = {'L', 'F', 'N', 'E', 'B'};
    static String[] brandName = {"Lakme", "Faces", "Nykaa", "Elle18", "Maybelline"};

    public static int[] getMakeupId() { 
        return makeupId; 
    }
    public static float[] getPrice() {
         return price;
         }
    public static long[] getUnitsSold() { 
        return unitsSold;
     }
    public static double[] getGst() {
         return gst;
         }
    public static byte[] getQualityRating() {
         return qualityRating; 
        }
    public static short[] getQuantityMl() { 
        return quantityMl; 
    }
    public static boolean[] getIsBranded() {
         return isBranded;
        
        }
    public static char[] getProductType() {
         return productType; 
        }
    public static String[] getBrandName() { 
        return brandName; 
    }
}
