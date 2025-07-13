import java.util.Arrays;
import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1 = sc.next();
        System.out.println("Enter the Second string");
        String s2 = sc.next();
        s1 = s1.replaceAll("\\s","").toLowerCase();
        s2 = s2.replaceAll("\\s","").toLowerCase();
        if(s1.length() != s2.length()){
            System.out.println("Not an Anagrams");
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagrams");
        }else {
            System.out.println("Not Anagrams");
        }
    }
}
