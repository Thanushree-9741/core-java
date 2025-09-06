package Package.logicprogram;

public class StringPermutations {

    static void permute(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Remaining string after removing ch
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // Recurse
            permute(remaining, result + ch);
        }
    }

    public static void main(String[] args) {
        String s = "ABC";
        System.out.println("Permutations of " + s + ":");
        permute(s, "");
    }

}
