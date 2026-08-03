package Arrays;

public class RemoveDup {
    static int removeDuplicate(int[] arr, int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

public static void main(String[] args) {

    int[] arr = {1,1,2,2,2,3,4,4,5};
    int n = arr.length;

    int newLength = removeDuplicate(arr, n);

    for (int i = 0; i < newLength; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
