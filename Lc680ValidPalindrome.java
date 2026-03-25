public class Lc680ValidPalindrome {
     public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return isPalindrome(s, start + 1, end) || 
                       isPalindrome(s, start, end - 1);
            }
            start++;
            end--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Lc680ValidPalindrome solution = new Lc680ValidPalindrome();
        String s = "abca";
        System.out.println(solution.validPalindrome(s));


    }
}
