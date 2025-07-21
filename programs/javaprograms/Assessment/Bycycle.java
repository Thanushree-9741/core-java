class Bycycle{
    static String company = "laidy bird";
    static float cost = 2000f;
    static String varenty = "10-02-2026";
    static long shopNumber = 8877665544L;
    static int billNo = 1231;
    
    public static void main(String[] args){
        String company = "break cycle";
        float cost = 10000f;
        String varenty = "10/02/2027";
        long shopNumber = 8877665544L;
        int billNo = 1235;
        

        

        System.out.println(company);
        System.out.println(cost);
        System.out.println(varenty);
        System.out.println(shopNumber);
        System.out.println(billNo);

        

        cycle();
        price();
        time();
        shop();
        bill();

        Bycycle.cycle();
        Bycycle.price();
        Bycycle.time();
        Bycycle.shop();
        Bycycle.bill();
    }
    
    public static void cycle(){
        System.out.println("my cycle company name is = "+ company );
    }

    public static void price(){
        System.out.println("my cycle price  is = "+ cost );
    }

    public static void time(){
        System.out.println("my cycle varenty date is = "+ varenty );
    }

    public static void shop(){
        System.out.println(" shop number is = "+ shopNumber );
    }

    public static void bill(){
        System.out.println("my cycle billno  is = "+ billNo );
    }
}