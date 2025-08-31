package Package.Logic;

public class AllPatternsWithoutImport {


        public static void main(String[] args) {
            int n = 5; // size of the patterns

            // 1. Right Triangle Star Pattern
            System.out.println("1. Right Triangle Star Pattern:");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();

            // 2. Inverted Right Triangle
            System.out.println("2. Inverted Right Triangle:");
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();

            // 3. Pyramid Pattern
            System.out.println("3. Pyramid Pattern:");
            for (int i = 1; i <= n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();

            // 4. Inverted Pyramid Pattern
            System.out.println("4. Inverted Pyramid:");
            for (int i = n; i >= 1; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();

            // 5. Diamond Pattern
            System.out.println("5. Diamond Pattern:");
            for (int i = 1; i <= n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();

            // 6. Number Triangle
            System.out.println("6. Number Triangle Pattern:");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            System.out.println();

            // 7. Alphabet Triangle
            System.out.println("7. Alphabet Triangle Pattern:");
            for (int i = 1; i <= n; i++) {
                char ch = 'A';
                for (int j = 1; j <= i; j++) {
                    System.out.print(ch + " ");
                    ch++;
                }
                System.out.println();
            }
            System.out.println();
        }
    }


