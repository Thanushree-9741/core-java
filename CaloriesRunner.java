class CaloriesRunner {
    public static void main(String[] args) {
        int[] ids = Calories.getCalorieId();
        for (int id : ids) {
            System.out.println("ID: " + id);
        }

        float[] weights = Calories.getWeightInGrams();
        for (float w : weights) {
            System.out.println("Weight: " + w);
        }

        long[] totalCalories = Calories.getTotalCalories();
        for (long c : totalCalories) {
            System.out.println("Total Calories: " + c);
        }

        double[] energy = Calories.getCalPerGram();
        double sum = 0;
        for (double e : energy) {
            System.out.println("Calories/Gram: " + e);
            sum += e;
        }
        float avg = (float) sum / energy.length;
        System.out.println("Average Calories/Gram: " + avg);

        byte[] ratings = Calories.getFoodRating();
        for (byte r : ratings) {
            System.out.println("Rating: " + r);
        }

        short[] fats = Calories.getFatPercent();
        for (short f : fats) {
            System.out.println("Fat %: " + f);
        }

        boolean[] healthy = Calories.getIsHealthy();
        for (boolean h : healthy) {
            System.out.println("Is Healthy: " + h);
        }

        char[] types = Calories.getFoodType();
        for (char t : types) {
            System.out.println("Type: " + t);
        }

        String[] names = Calories.getFoodName();
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
