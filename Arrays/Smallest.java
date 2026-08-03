package Arrays;
import java.util.Arrays;

public class Smallest {
    static int smallesElement(int[] arr, int n){
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String[] args) {
        int[] arr = {8,3,6,1,5};
        int n = arr.length;
        int res = smallesElement(arr,n);
        System.err.println(res);
    }
}
