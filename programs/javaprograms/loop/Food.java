class Food {
    String foodName;
    String category;
    float price;
    String taste;
    boolean isVegetarian;

    public static void main(String[] args) {
        // 1
        Food f1 = new Food();
        f1.foodName = "Dosa";
        System.out.println(f1.foodName);
        f1.setFoodName("Masala Dosa");
        System.out.println(f1.foodName);

        // 2
        Food f2 = new Food();
        f2.category = "Breakfast";
        System.out.println(f2.category);
        f2.setCategory("South Indian");
        System.out.println(f2.category);

        // 3
        Food f3 = new Food();
        f3.price = 40.0f;
        System.out.println(f3.price);
        f3.setPrice(45.0f);
        System.out.println(f3.price);

        // 4
        Food f4 = new Food();
        f4.taste = "Spicy";
        System.out.println(f4.taste);
        f4.setTaste("Mild Spicy");
        System.out.println(f4.taste);

        // 5
        Food f5 = new Food();
        f5.isVegetarian = true;
        System.out.println(f5.isVegetarian);
        f5.setIsVegetarian(false);
        System.out.println(f5.isVegetarian);

        // 6
        Food f6 = new Food();
        f6.foodName = "Idli";
        System.out.println(f6.foodName);
        f6.setFoodNameAgain("Thatte Idli");
        System.out.println(f6.foodName);

        // 7
        Food f7 = new Food();
        f7.category = "Lunch";
        System.out.println(f7.category);
        f7.setCategoryAgain("Combo");
        System.out.println(f7.category);

        // 8
        Food f8 = new Food();
        f8.price = 70.0f;
        System.out.println(f8.price);
        f8.setPriceAgain(75.5f);
        System.out.println(f8.price);

        // 9
        Food f9 = new Food();
        f9.taste = "Sweet";
        System.out.println(f9.taste);
        f9.setTasteAgain("Very Sweet");
        System.out.println(f9.taste);

        // 10
        Food f10 = new Food();
        f10.isVegetarian = true;
        System.out.println(f10.isVegetarian);
        f10.setIsVegetarianAgain(true);
        System.out.println(f10.isVegetarian);
    }

    public void setFoodName(String name) {
        foodName = name;
    }

    public void setFoodNameAgain(String name) {
        foodName = name;
    }

    public void setCategory(String cat) {
        category = cat;
    }

    public void setCategoryAgain(String cat) {
        category = cat;
    }

    public void setPrice(float p) {
        price = p;
    }

    public void setPriceAgain(float p) {
        price = p;
    }

    public void setTaste(String t) {
        taste = t;
    }

    public void setTasteAgain(String t) {
        taste = t;
    }

    public void setIsVegetarian(boolean veg) {
        isVegetarian = veg;
    }

    public void setIsVegetarianAgain(boolean veg) {
        isVegetarian = veg;
    }
}
