class Div2{
    public static void main(String[] args){
        div();
        divi((short)108,(short)12);
    }
    public static void div(){
        byte a = 39;
        byte b = 13;
        byte c = (byte)(a / b);
    System.out.println(c);
}
    public static void divi(short a, short b){
        short c = (short)(a / b);
        System.out.println(c);
    } 
}