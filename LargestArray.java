// This is the code for finding th elargest elemnt in array
// approach is basically fist we will initialize the largest with initial element of array and using for loop with considering i=1 checking and comparing with intialized largest and if we find 
// any element greater than largest then we will update the largest with that element and at the end of loop we will return the largest element in array

public class LargestArray {
    public static int largestArray(int arr[] , int key){
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
           
        }
         return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,68};
        int largestArray = largestArray(arr, 0);
        System.out.println(largestArray);
    }
}
