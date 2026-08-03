package Arrays;

public class CountFreq {
    static int countFreq(int[] arr, int n, int find){
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == find){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,5,3};
        int n = arr.length;
        int find = 3;
        int res = countFreq(arr, n, find);
        System.err.println(res);
    }
}
