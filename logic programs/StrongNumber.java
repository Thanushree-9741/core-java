package Package.logicprogram;
public class StrongNumber {
    public static void main(String[] args) {
        int n = 145;  // you can change the number
         int sum = 0, temp = n;
        while (temp > 0) {
        int digit = temp % 10;
        sum = sum + factorial(digit);
        temp = temp / 10;        }
        if (sum == n) {
            System.out.println(n + " is a Strong Number");
        } else {
            System.out.println(n + " is NOT a Strong Number");
        }    }    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;        }
        return fact;    }}