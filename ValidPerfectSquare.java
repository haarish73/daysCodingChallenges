public class ValidPerfectSquare{

    // class Solution {
    public boolean isPerfectSquare(int num) {

        // this is the approach using brute force approach

        for(long i=1;i*i <= num;i++){
            if(i * i == num) return true;

            
        }
        return false;
    // }
// }
}
//         // this is the approach using binary search 
//         int start =1 ;
//         int end = num;

//         while(start <= end){
//             int mid = (start+end) / 2;
//             int square = mid * mid;

//             if(square == num){
//                 return true;
//             }
//              else if(square < num){
//                 start = (int)mid + 1;
//             }
//             else{
//                 end = (int)mid - 1;
//             }
//         }
//         return false;
//     }
// }
    public static void main(String[] args) {
        int num = 16;
        ValidPerfectSquare obj = new ValidPerfectSquare();
        boolean result = obj.isPerfectSquare(num);
        System.out.println(result);
    }
}