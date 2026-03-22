public class CheckPalindrome {

    static boolean isPalin(String str, int i){
        if(i >= str.length()/2) return true;
        if(str.charAt(i) != str.charAt(str.length()-i-1)) return false;
        return isPalin(str, i+1);
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalin(str, 0));
    }
}
