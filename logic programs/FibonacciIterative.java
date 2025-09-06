package Package.logicprogram;

public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 10; // number of terms
        int a = 0, b = 1;

        System.out.println("Fibonacci Series (Iterative):");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

}
