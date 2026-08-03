package Arrays;

public class MissingNumber {

    static int missingNumber(int[] arr) {

        int n = arr.length + 1;
        int sum = 0;

        // Loop only through the array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int expectedSum = n * (n + 1) / 2;

        return expectedSum - sum;
    }

    public static void main(String[] args) {

        int[] arr = {8, 2, 4, 5, 3, 7, 1};

        System.out.println(missingNumber(arr));
    }
}