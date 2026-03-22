public class SumNumbers {

    // 2nd approach using recursions

    static int sum(int n){
        if(n <= 1){
            return 0;
        }

        return n+sum(n-1);
    }
    public static void main(String[] args) {
        // first approach

        // int n=5;
        // int sum = 0;
        // for(int i=0;i<=n;i++){
        //     sum+=i;
        // }

        // System.out.println(sum);
        int n = 5;
        System.out.println(sum(n));
    }
}
