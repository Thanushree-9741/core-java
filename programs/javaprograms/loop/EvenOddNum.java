class EvenOddNum {

    static final int twoIntoTow;
    static {
        twoIntoTow = 4;
        System.out.println(twoIntoTow);
    }

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            System.out.println("Number is: " + i);

            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            }

            if (i % 2 != 0) {
                System.out.println("Odd number: " + i);
            }

            if (i % 3 == 0) {
                System.out.println("Divisible by 3: " + i);
            }

            if (i % 5 == 0) {
                System.out.println("Divisible by 5: " + i);
            }

            System.out.println(); // for line spacing
        }
    }
}
