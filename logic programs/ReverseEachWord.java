package Package.logicprogram;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            result += reversedWord + " ";
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed Each Word: " + result.trim());
    }
}
