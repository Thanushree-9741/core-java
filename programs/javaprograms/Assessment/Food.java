class Food{
    static int id = 2;
    static String name = "dosa";
    static String address = "kolar";
    static long mobile = 9980544210L;
    static float amount = 20F;


    public static void main(String[] args){
        Food.order();
         orderitem();

      //int id = 4;
      //String name = "chitranna";
      //String address = "Mulbagal";
      //long mobile = 9980544320L;
      //float amount = 30F;
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(mobile);
        System.out.println(amount);

        order();
        Food.orderitem();
        
        id = 6;
        name = "curd rice";
        address = "Ramapura";
        mobile = 9741206563L;
        amount = 25f;

         Food.order();
         orderitem();


    } 

    public static void order(){
        System.out.println(" order ID is = " + id + " item name = " + name + " address of order = " + address + " and orderer mobile no = " + mobile + " final price is = " + amount );
        System.out.println("Thank you for order");
    }

     public static void orderitem(){
        System.out.println(" order ID is = " + id + " item name = " + name + " address of order = " + address + " and orderer mobile no = " + mobile + " final price is = " + amount );
        System.out.println("Thank you for order");
    }

    
}