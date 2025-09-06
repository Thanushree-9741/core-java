package Package.logicprogram;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // missing 3
        int n = 6; // total numbers from 1 to n

        int total = n * (n + 1) / 2; // sum of 1 to n
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }

        int missing = total - sum;
        System.out.println("Missing number is: " + missing);
    }
}
