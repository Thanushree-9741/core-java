class Coursecenter{
 static String name = "X-works";
 static String address = "Btm layout";
 static int block = 1;
 static String openingTime = "09:00 am"; 
 static long mobile = 9988776655L;

 public static void main(String[] args){
String name = "works";
String address = "Rameshvaram";
int block = 4;
String openingTime = "10:00 am";
long mobile = 6688778855L;

System.out.println(name);
System.out.println(address);
System.out.println(block);
System.out.println(openingTime);
System.out.println(mobile);

center();
Coursecenter.center();

 }

 public static void center() {
    System.out.println("course center name " + name + " address" + address + " in " + block + " block and opening time is " + openingTime + " mobile no is " + mobile); 
 }

 
}