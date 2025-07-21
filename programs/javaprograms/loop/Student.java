class Student{
    String name;
    int id;
    int m1;
    int m2;
    int m3;

    public static void main(String[] args){
         //1
        Student n1 = new Student();
        n1.name = "Thanu";
        System.out.println(n1.name);
        n1.setName("Nandeesha");
        System.out.println(n1.name);

//2
        Student n2 = new Student();
        n2.name = "Manjula";
        System.out.println(n2.name);
        n2.setNameStud("Ravikumar");
        System.out.println(n2.name);
//3
         Student n3 = new Student();
         n3.id = 121;
         System.out.println(n3.id);
         n3.setId(122);
System.out.println(n3.id);
         //4
         Student n4 = new Student();
         n4.id = 123;
         System.out.println(n4.id);
         n4.setIdNo(124);
         System.out.println(n4.id);

         //5
          Student n5 = new Student();
          n5.m1 = 90;
          System.out.println(n5.m1);
          n5.setMark(78);
System.out.println(n5.m1);
          //6
          Student n6 = new Student();
          n6.m1 = 80;
          System.out.println(n5.m1);
          n5.setMarks(87);
System.out.println(n6.m1);
          //7
          Student n7 = new Student();
          n7.m2 = 90;
          System.out.println(n7.m2);
          n7.setMarkM(89);
         System.out.println(n7.m2);
          //8
          Student n8 = new Student();
          n8.m2 = 90;
          System.out.println(n8.m2);
          n8.setMarkMs(97);
System.out.println(n8.m2);

          //9
          Student n9 = new Student();
          n9.m3 = 90;
          System.out.println(n9.m3);
          n9.setMarkMm(98);
System.out.println(n9.m3);
          //10
          Student n10 = new Student();
          n10.m3 = 90;
          System.out.println(n10.m3);
          n10.setMarkMms(89);
          System.out.println(n10.m3);
}

public void setName(String n1){
        name = n1;
    }

    public void setNameStud(String n2){
        name = n2;
    }

    public void setId(int n3){
        id = n3;
    }

     public void setIdNo(int n4){
        id = n4;
    }

    public void setMark(int n5){
        m1 = n5;
    }

        public void setMarks(int n6){
        m1 = n6;
    }

    public void setMarkM(int n7){
        m2 = n7;
    }

    public void setMarkMs(int n8){
        m2 = n8;
    }


    public void setMarkMm(int n9){
        m3 = n9;
    }

    public void setMarkMms(int n10){
        m3 = n10;
    }

}
