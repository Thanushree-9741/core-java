class Add{
    public static void main(String[] args){
        add();
        add(123, 11f);
    }
    public static void add(){
        float i = 10f;
        int j = 20;
        int k =  (int)(i + j);
        System.out.println(k);
    }

    public static void add(int d, float c){
   float a = d + c;
   System.out.println(a);
    }
}