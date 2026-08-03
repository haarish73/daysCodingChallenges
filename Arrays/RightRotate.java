package Arrays;

public class RightRotate {

    static void rightRotateByOne(int[] arr, int n) {

        reverse(arr, 0, n - 1);   // Reverse whole array
        reverse(arr, 1, n - 1);   // Reverse from index 1
    }

    static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        rightRotateByOne(arr, arr.length);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}