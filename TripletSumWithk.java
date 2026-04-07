import java.io.*;
import java.util.*;

public class Main {

static boolean findTriple(int arr[], int n, int k){
    Arrays.sort(arr);
    for(int i=0;i<n-2;i++){
        int start = i+1;
        int end = n-1;

        while(start < end){
            int currSum = arr[i] + arr[start] + arr[end];

            if(currSum == k){
                return true;
            }
            else if(currSum < k ){
                start++;
            }
            else{
                end--;
            }
        }
    }
    return false;
    
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++){
            int n = s.nextInt();
            int k = s.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j]  = s.nextInt();
            }

            // int k = s.nextInt();

            System.out.println(findTriple(arr,n, k));
        }
    }
}


ye dekh aaisa karna tha
