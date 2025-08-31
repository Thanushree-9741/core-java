class Factorial{
    public static void main(String[] args) {
        long fact6 = 1, fact24 = 1, fact120 = 1;

        // Factorial of 6
        for (int i = 1; i <= 6; i++) {
            fact6 *= i;
        }

        // Factorial of 24 (will overflow in long, so result is incorrect)
        for (int i = 1; i <= 24; i++) {
            fact24 *= i;
        }

        // Factorial of 120 (will definitely overflow)
        for (int i = 1; i <= 120; i++) {
            fact120 *= i;
        }

        System.out.println("6! = " + fact6);
        System.out.println("24! (overflow) = " + fact24);
        System.out.println("120! (overflow) = " + fact120);
    }
}
