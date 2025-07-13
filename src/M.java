import java.util.Scanner;

public class M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String s1= sc.next();
        System.out.println("Enter the Second String");
        String s2 = sc.next();
        String rev = "";
        String dup =s1;
        if(s1.length()!=s2.length()){
            System.out.println("not a Palindrome");
        }
        for(int i=s1.length()-1;i>=0;i--){
            rev= rev+s1.charAt(i);
        }
        if(rev.equals(dup)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
