class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zerosCount = 0;

        // Count zeros
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) zerosCount++;
        }

        int start = n - 1;
        int end = n + zerosCount - 1;

        while (start >= 0) {

            
            if (end < n) {
                arr[end] = arr[start];
            }

            
            if (arr[start] == 0) {
                end--;
                if (end < n) {
                    arr[end] = 0;
                }
            }

            start--;
            end--;
        }
    }
}