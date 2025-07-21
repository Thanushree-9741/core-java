class RecipeRunner {
    public static void main(String[] args) {
        System.out.println("Recipe Name: " + Recipe.name);
        System.out.println("Cooking Time: " + Recipe.cookingTime);
        System.out.println("Servings: " + Recipe.servings);
        System.out.println("Cuisine: " + Recipe.cuisine);
        System.out.println("Ingredients: " + Recipe.ingredients);
        
        System.out.println("Recipe Info: " + Recipe.getRecipeInfo());
        System.out.println("Is Quick Recipe: " + Recipe.isQuickRecipe());
        System.out.println("Cooking Time: " + Recipe.getCookingTime());
        System.out.println("Cuisine: " + Recipe.getCuisine());
        System.out.println("Ingredients: " + Recipe.getIngredients());
    }
}
