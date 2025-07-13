class Man{
    String name;
    Man(String n){
       name=n;
    }
    void greet(){
        System.out.println("Hello From "+name);
    }
}
class Worker extends  Man{
       String job;
       Worker(String n, String j){
         super(n);
         job = j;
       }
       void work(){
           System.out.println(name+" works as "+ job);
       }
}
public class Test {
    public static void main(String[] args) {
        Worker w1 = new Worker("Avanish","Worker");
        w1.greet();
        w1.work();

    }
}
//Hello From Avanish
//Avanish works as Worker
