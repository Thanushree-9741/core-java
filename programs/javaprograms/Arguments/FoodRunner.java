class FoodRunner{

public static void main(String[] args){
    
    Food food = new Food();
    food.setName("Rice");
    System.out.println(food.getName());
    food.setId(3);
    System.out.println(food.getId());
    food.setPrice(20f);
    System.out.println(food.getPrice());

 }

}