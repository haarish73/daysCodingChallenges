// this is the code for the linear search 

class LinearSearch{
    public static int linearSearch(int arr[], int key){

        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
        }

    
    public static void main(String[] args){
        int arr[] = {1,2,4,5,68};
        int key = 5;

        int linearSearch = linearSearch(arr, key);
        System.out.println(linearSearch);
    }
}
