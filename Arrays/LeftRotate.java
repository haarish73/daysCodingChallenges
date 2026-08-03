package Arrays;

public class LeftRotate {
    static void leftRotate(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int n = arr.length;

        leftRotate(arr, n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
