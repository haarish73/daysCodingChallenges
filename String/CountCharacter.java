public class CountCharacter {

    static int countChar(String s) {

        s = s.replace(" ", "");

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "Java Programming";

        System.out.println("Total Characters: " + countChar(s));
    }
}