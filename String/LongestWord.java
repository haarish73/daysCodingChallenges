public class LongestWord {

    static void longestWord(String s) {

        String[] words = s.split(" ");

        String longest = "";

        for (String word : words) {

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }

    public static void main(String[] args) {

        String s = "i love programming";

        longestWord(s);
    }
}