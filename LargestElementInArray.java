public class LargestElementInArray {
    public static void main(String[] args) {
        int[] numbers = {23, 67, 12, 98, 34};

        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element: " + largest);
    }
}
