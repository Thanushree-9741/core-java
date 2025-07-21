class Beauti{
    static String name = "deepthi";
    static float heigth = 5.2f;
    static long mobile = 8867271459L;
    static String address = "chikkamagaluru";

    public static void main(String[] args){
        //String name = "Supriya";
        System.out.println(name);
        name = "Meghana";
        System.out.println ("beauti name " + name);
        System.out.println ("beauti height " + heigth);
        System.out.println ("beauti mobile no " + mobile);
        girl();
        Beauti.girl1();
        address = "Kolar";
        System.out.println ("beauti address " + address);

        girl2();
    }

    public static void girl(){
        System.out.println("beauti girl" + name + "and her height is " + heigth);
    }

    public static void girl1(){
        System.out.println("beauti mobileno " + mobile);

    }

    public static void girl2(){
        System.out.println("beauti address " + address);

    }
    
}