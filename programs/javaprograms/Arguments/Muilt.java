class Muilt{
    public static void main(String[] args){
        Multi();
        Multi((byte)2, 4.2f);
    }
    public static void Multi(){
        System.out.println("without arguments ");
        float a = 2.8f;
        double b = 3.5;
        double c = a * b;
        System.out.println(c);
    }
    public static void Multi(byte g , float h){
        System.out.println("with arguments");
        float i = g * h;
        System.out.println(i);
    }
}