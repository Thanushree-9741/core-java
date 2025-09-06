package Package.logicprogram;

public class DuplicateCharactersSimple {

    public static void main(String[] args) {
        String str = "programming";

        System.out.println("Duplicate characters in \"" + str + "\":");

        // Convert to char array
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            if (chars[i] == '0')  // already counted
                continue;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0';  // mark as visited
                }
            }

            if (count > 1) {
                System.out.println(chars[i] + " → " + count + " times");
            }
        }
    }
}
