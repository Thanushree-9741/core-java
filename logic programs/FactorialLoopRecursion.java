 class FactorialLoopRecursion {

    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int num = 5;
        long fact = factorial(num);

        System.out.println("using for Recursion");
        System.out.println("Factorial of " + num + " is: " + fact);


        System.out.println("===================================================");

        int number = 5;
        long fact = 1;
         System.out.println("using for loop");
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
