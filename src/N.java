import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s+");
        System.out.println(words.length);

    }
}
