package Package.Logic;

public class ReverseString {

    public static void main(String[] args) {
        String str = "HelloWorld";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + rev);
    }
}
