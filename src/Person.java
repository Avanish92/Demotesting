public class Person {
    String name;
    String job;

    Person(String n,String j){
        name=n;
        job=j;
    }

    public void introduce(){
        System.out.println("I am "+ name +", working as " + job);
    }
    public static void main(String[] args) {
        Person p1 = new Person("Avanish","Coder");
        p1.introduce();
    }
}
//output
//I am Avanish, working as Coder
