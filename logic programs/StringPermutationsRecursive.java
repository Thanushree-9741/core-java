package Package.logicprogram;

public class StringPermutationsRecursive {
    static void permute(String str, String ans) {
        if (str.isEmpty()) {
        // if (str.length() == 0)
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i + 1);
            permute(rem, ans + ch);
        }
    }

    public static void main(String[] args) {
        String s = "ABC";
        System.out.println("Permutations (Recursive):");
        permute(s, "");
    }
}
