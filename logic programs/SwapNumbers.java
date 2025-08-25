class SwapNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        // Swapping without using third variable
        a = a + b; // a = 30
        b = a - b; // b = 10
        a = a - b; // a = 20

        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
