public class J {
    public static void main(String[] args) {
        String s = "My Name is abc";
        String rev = "";
        for (int i = s.length()-1; i >=0 ; i--) {
            System.out.print(rev+s.charAt(i));
        }
    }
}
