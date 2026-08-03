public class SecondLargest {

    static int secondLargestElement(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > firstLargest) {
                firstLargest = arr[i];
            }
        }

        // Find the second largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 2, 9};
        int n = arr.length;

        System.out.println("Second Largest: " + secondLargestElement(arr, n));
    }
}