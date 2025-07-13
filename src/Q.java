public class Q {
    public static void main(String[] args) {
        String s1 = "Programming";
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            char currentchar = s1.charAt(i);
            if(result.indexOf(currentchar)== -1){
                result+=currentchar;
            }
        }
        System.out.println("String after removing duplicates: " + result);
    }
}
