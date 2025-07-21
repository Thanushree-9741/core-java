class Multi2{
    public static void main(String[] args){
        multi();
        multi(244.2d, 4.2d);
    }
    public static void multi(){
        System.out.println("without arguments ");
        short a = 8;
        short b = 3;
        short c = (short)(a * b);
        System.out.println(c);
    }
    public static void multi(double g , double h){
        System.out.println("with arguments");
        double i = g * h;
        System.out.println(i);
    }
}