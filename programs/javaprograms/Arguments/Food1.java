class Food1{
    static int id = 2;
    static String name = "dosa";
    static String address = "kolar";

    public static void main(String[] args){

        int foodId = idOfFood();
        System.out.println(foodId);

        String foodName = nameOfFood();
        System.out.println(foodName);

        String foodAddress = addressOfFood();
        System.out.println(foodAddress);


    } 

    public static int idOfFood(){
        return id;
    }v

    public static String nameOfFood(){
        return name;
    }

    public static String addressOfFood(){
        return address;
    }
}