public class ReverseArray {
    static void reverseArray(int arr[] ){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,68};
        reverseArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
