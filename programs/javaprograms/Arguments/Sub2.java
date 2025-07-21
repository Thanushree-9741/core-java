class Sub2{
    public static void main(String[] args){
        sub();
        sub(123L, 1125346L);
    }
    public static void sub(){
        float i = 10f;
        float j = 20f;
        float k =  (int)(i - j);
        System.out.println(k);
    }

    public static void sub(long d, long c){
   long a = d - c;
   System.out.println(a);
    }
}