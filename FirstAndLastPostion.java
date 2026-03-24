public class FirstAndLastPostion {
    class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int first = -1;
        // int last = -1;

        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] == target){
        //         if(first == -1) first = i;
        //         last = i;
        //     }
        // }
        // return new int[]{first,last};

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(nums[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            else if(nums[mid] < target){   
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;   
    }

    private int findLast(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(nums[mid] == target){
                ans = mid;
                start = mid + 1;
            }
            else if(nums[mid] < target){   
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;   
    }
}
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        FirstAndLastPostion firstAndLastPostion = new FirstAndLastPostion();
        Solution solution = firstAndLastPostion.new Solution();
        int[] result = solution.searchRange(nums, target);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
