class Add2{
    public static void main(String[] args){
        add();
        add(123, 11);
    }
    public static void add(){
        int i = 10;
        int j = 20;
        int k =  i + j;
        System.out.println(k);
    }

    public static void add(int d, int c){
   int a = d + c;
   System.out.println(a);
    }
}