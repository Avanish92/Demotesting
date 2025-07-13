import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.nextLine();
        sc.close();

        StringBuilder result = new StringBuilder();
        for(char ch : input.toCharArray()){
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                result.append(ch);
            }
        }
        System.out.println(result);


    }
}