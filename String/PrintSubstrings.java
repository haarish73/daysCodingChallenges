public class PrintSubstrings {
    static void printSubstring(String s, int n){
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=i;j<n;j++){
                
                System.out.println(s.substring(i,j+1));
                count++;
                System.out.println(count);
                
            }
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();
        printSubstring(s, n);
    }
}
