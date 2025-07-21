class Trining{
    static String name = "X-workz";
    static String address = "BTM";
    static float fees = 10000f;
    

    public static void main(String[] args){

        String centerName = nameOfTrining();
        System.out.println(centerName);

        String centerAdd = addressOfTrining();
        System.out.println(centerAdd);

        float centerfees = feesOfTrining();
        System.out.println(centerfees);

    }

    public static String nameOfTrining(){
        return name;
    }

    public static String addressOfTrining(){
        return address;
    }

    public static float feesOfTrining(){
        return fees;
    }
}