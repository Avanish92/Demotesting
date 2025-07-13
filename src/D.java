public class D {
    public static void main(String[] args) {
        String s1 = "dad";
        String rev = "";

        for (int i = s1.length()-1; i >=0 ; i--) {
            rev=rev+s1.charAt(i);
        }
        if(s1.equals(rev)){
            System.out.println(s1+" Plaindrome");
        }else{
            System.out.println(s1+"Not a Plaindrome");
        }

    }
}
