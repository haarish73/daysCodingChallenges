public class VowelsAndConson {
    public static void main(String[] args) {
        String s = "Education";
        int n = s.length();
        int vowels = 0;
        int consonats = 0;

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                consonats++;
            }else{
                vowels++;
            }
        }
        System.err.println("Total consonats" + " " +consonats);
        System.err.println("Total vowels" + " " +vowels);
    }
}
