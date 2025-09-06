package Package.logicprogram;

public class StringPermutationsIterative {
    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C'}; // Input string as char array
        int n = arr.length;

        // Initialize the counter array manually
        int[] c = new int[n];
        for (int k = 0; k < n; k++) {
            c[k] = 0;
        }

        System.out.println("Permutations (Iterative):");
        // Print original arrangement
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k]);
        }
        System.out.println();

        int i = 0;
        while (i < n) {
            if (c[i] < i) {
                if (i % 2 == 0) {
                    // Swap arr[0] and arr[i]
                    char temp = arr[0];
                    arr[0] = arr[i];
                    arr[i] = temp;
                } else {
                    // Swap arr[c[i]] and arr[i]
                    char temp = arr[c[i]];
                    arr[c[i]] = arr[i];
                    arr[i] = temp;
                }

                // Print current permutation
                for (int k = 0; k < n; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println();

                c[i]++;
                i = 0;
            } else {
                c[i] = 0;
                i++;
            }
        }
    }

}
