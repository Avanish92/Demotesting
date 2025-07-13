class Person1{
    String name;
    Person1(String n){
        name=n;
    }
    public void work(){
        System.out.println("I am "+name+"I work");
    }
}
class Coder extends Person1{
         String Languages;
         Coder( String n,String l){
             super(n);
             Languages = l;
         }
    public void work(){
        System.out.println(name+" Codes in"+ Languages);
    }

}
public class Test1 {
    public static void main(String[] args) {
        Coder c1 = new Coder("Avanish","Java");
        c1.work();
    }
}
//Avanish Codes in Java
