public class Calculator {
    int a;
    int b,res;
    public int divide(int a,int b){
      return a/b;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 5, 0, 2};
        Calculator cal = new Calculator();
        for (int i = 0; i <= numbers.length-1; i++) {
            try{
                int res = cal.divide(2,numbers[i]);
                System.out.println(numbers[i] + " divided by 2 is " + res);
            }catch (ArithmeticException ex){
                System.out.println("Cannot divide by zero");
            }
        }
    }
}
//10 divided by 2 is 5
//        5 divided by 2 is 2
//        0 divided by 2 is 0
//        2 divided by 2 is 1