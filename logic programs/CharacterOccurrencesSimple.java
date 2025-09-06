package Package.logicprogram;

public class CharacterOccurrencesSimple {
    public static void main(String[] args) {
        String str = "hello world";

        System.out.println("Occurrences of each character in \"" + str + "\":");

        // Convert to char array
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ' || chars[i] == '0')  // skip spaces or counted
                continue;

            int count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0';  // mark as visited
                }
            }

            System.out.println(chars[i] + " → " + count);
        }
    }
}
