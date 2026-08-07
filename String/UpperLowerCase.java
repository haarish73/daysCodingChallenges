public class UpperLowerCase {

    public static void main(String[] args) {

        String s = "HeLLo";
        int upperCase = 0;
        int lowerCase = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upperCase++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowerCase++;
            }
        }

        System.out.println("Total UpperCase: " + upperCase);
        System.out.println("Total LowerCase: " + lowerCase);
    }
}