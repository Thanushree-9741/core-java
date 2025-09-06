package Package.logicprogram;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != -1) {
                    System.out.println(arr[i]);
                    arr[j] = -1; // mark as counted
                    break;
                }
            }
        }
    }
}
