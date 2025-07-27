public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] numbers = {23, 67, 12, 98, 34};

        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
    }
}
