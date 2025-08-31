package Package.Logic;

public class ReverseEachWord {

    public static void main(String[] args) {
        String str = "Java Programming Language";
        String[] words = str.split(" ");  // split by spaces
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                revWord = revWord + word.charAt(j);
            }

            result = result + revWord + " ";
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed Each Word: " + result);
    }
}
