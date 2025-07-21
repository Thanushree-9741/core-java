class Recipe {
    static String name = "Pasta";
    static int cookingTime = 30; // in minutes
    static int servings = 4;
    static String cuisine = "Italian";
    static String ingredients = "Pasta, Tomato Sauce, Cheese";

    public static String getRecipeInfo() {
        return name + " - " + servings + " servings";
    }

    public static boolean isQuickRecipe() {
        return cookingTime < 30;
    }

    public static int getCookingTime() {
        return cookingTime;
    }

    public static String getCuisine() {
        return cuisine;
    }

    public static String getIngredients() {
        return ingredients;
    }
}
