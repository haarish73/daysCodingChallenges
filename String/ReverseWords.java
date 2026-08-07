public class ReverseWords {
    public static void main(String[] args) {
        // in this approach following this steps to solve the solutions
        // Split string into words
        // Traverse from last to first
        // Build result string

        String  s = "i love java";
        String[] words = s.split(" ");
        String result = "";
        for(int i=words.length-1;i>=0;i--){
            result += words[i]+ " ";
        }

        System.out.println(result.trim());

    }
}
