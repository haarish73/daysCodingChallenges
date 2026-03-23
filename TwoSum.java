public class TwoSum {
     public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int start = 0;
        int end  = n-1;

        while(start < end){
            int sum = numbers[start] + numbers[end];
            if(sum == target){
                return new int[]{start+1, end+1};
            }else if(sum < target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int numbers[] = {2,7,11,15};
        int target = 9;
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(numbers, target);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
