class Person2 {
    String name;
    String job;

    Person2(String n, String j) {
        name = n;
        job = j;
    }

   public void introduce() {
        System.out.println(name + "," + job);
    }
}
public class U {
    public static void main(String[] args) {
        Person2[] p = new Person2[3];
        p[0] = new Person2("Avanish", "Tester");
        p[1] = new Person2("Rahul", "Designer");
        p[2] = new Person2("Priya", "Tester");
        for (int i = 0; i < p.length; i++) {
            p[i].introduce();
        }
    }
}
//Avanish,Tester
//Rahul,Designer
//Priya,Tester


