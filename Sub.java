class Sub{
    public static void main(String[] args){
        sub();
        sub(123, 11f);
    }
    public static void sub(){
        float i = 10f;
        int j = 20;
        int k =  (int)(i - j);
        System.out.println(k);
    }

    public static void sub(int d, float c){
   float a = d - c;
   System.out.println(a);
    }
}