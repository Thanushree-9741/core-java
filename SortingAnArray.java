class SortingAnArray {

    public static void main(String[] args) {

        
        int[] numbers = {5, 2, 9, 1, 6};

        // Print array before sorting
        System.out.println("Before sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Ascending Order
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Print array after sorting
        System.out.println("\nAfter sorting (ascending):");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

