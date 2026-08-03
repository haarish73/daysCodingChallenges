import java.util.*;
class main{
    static int largestElement(int[] arr, int n){
        Arrays.sort(arr);
        int max = 0;
        // for(int i=0;i<n;i++){
        //     max = arr[];
        // }

        return arr[n-1];
    }
    public static void main(String[] args){
        int [] arr = {2,5,1,9,6};
        int n = arr.length;
        int res = largestElement(arr,n);
        System.err.println(res);
    }
}