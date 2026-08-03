package Arrays;

public class Reverse {

    static void reverseArray(int[] arr, int n) {

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        reverseArray(arr, arr.length);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}