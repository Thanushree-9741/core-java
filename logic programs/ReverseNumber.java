package Package.logicprogram;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123;   // example number
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;       // get last digit
            reversed = reversed * 10 + digit; // build reversed
            num = num / 10;             // remove last digit
        }

        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reversed);
    }
}
