public class CountFreq {
    public static void main(String[] args) {
        String s = "engineering";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            boolean isVisited = false;
            for (int k = 0; k < i; k++) {
                if (s.charAt(k) == ch) {
                    isVisited = true;
                    break;
                }
            }

            if (isVisited) {
                continue;
            }
            int freq = 0;
            for (int j = i; j < n; j++) {
                if (ch == s.charAt(j)) {
                    freq++;
                }
            }

            System.err.println(ch + "->" + freq);
        }

    }
}
