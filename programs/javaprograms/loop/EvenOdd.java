class EvenOdd {

    static final int twoIntoTow;
    static {
        twoIntoTow = 4;
        System.out.println("Static Block Output: " + twoIntoTow);
    }

    public static void main(String[] args) {
         System.out.println();

        System.out.println("\nNumbers from 0 to 100:");
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        
        }
        System.out.println();

        System.out.println("even numbers are");
        for (int i = 0; i <= 50; i++){
            
            if (i % 2 == 0) {
                System.out.println("evenu number" + i);

            }
        }
         System.out.println();

        System.out.println("odd numbers are");
        for (int i = 0; i <= 70; i++){
            
            if (i % 2 != 0) {
                System.out.println("Odd number: " + i);
            }
       
        }
 System.out.println();
System.out.println("3 divied numbers are");
for (int i = 0; i <= 90; i++){
    
             if (i % 3 == 0) {
                
                System.out.println("Divisible by 3: " + i);
            }
        }
 System.out.println();

        System.out.println("5 divied numbers are");
for (int i = 0; i <= 200; i++){
 
            if (i % 5 == 0) {
                System.out.println("Divisible by 5: " + i);
            }
}
         System.out.println();
    }

        
    }

