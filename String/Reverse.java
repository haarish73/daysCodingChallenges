public class Reverse{
    public static void main(String[] args){
        String s = "Hello";
        int n = s.length();


        for(int i=n-1;i>=0;i--){
            System.out.print(s.toLowerCase().charAt(i));
        }
    }
}