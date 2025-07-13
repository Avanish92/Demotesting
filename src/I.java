public class I {
    public static void main(String[] args) {
        String str = "This is test string for java";
        String[] words = str.split("");
        StringBuilder result = new StringBuilder();
        String rev="";
        for(String word : words){
            if(word.length()>3){
                for (int i = str.length(); i >0; i--) {
                    System.out.println(rev+word.charAt(i));
                }
            }
        }
    }
}
