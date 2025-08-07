class TailorRunner{

    public static void main(String[] args){

        Tailor t1 = new Tailor();
        System.out.println(t1.getName());
        System.out.println(t1.getMobile());
        System.out.println(t1.getAddress());
        System.out.println(t1.getHomeNo());

        System.out.println("using single parameter constructor");
        Tailor t2 = new Tailor("Ravi");
        System.out.println(t2.getName());

        System.out.println("using two parameter constructor");
        Tailor t3 = new Tailor("Manju", 9988007871L);
        System.out.println(t3.getName());
        System.out.println(t3.getMobile());

        System.out.println("using three parameter constructor");
        Tailor t4 = new Tailor("Manjula", 6686858453L, "Kolar");
        System.out.println(t4.getName());
        System.out.println(t4.getMobile());
        System.out.println(t4.getAddress());

        
        System.out.println("using three parameter constructor");
        Tailor t5 = new Tailor("ManjulaDevi", 9734524312L, "Sangondahalli", 12);
        System.out.println(t5.getName());
        System.out.println(t5.getMobile());
        System.out.println(t5.getAddress());
        System.out.println(t5.getHomeNo());


    }
}