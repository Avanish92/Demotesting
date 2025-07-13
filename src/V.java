public class V {
    private String name;
    private int age;
    V(String n, int a){
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }
    public void showDetails(){
        System.out.println("Student: "+name + " Age: "+age);
    }

    public static void main(String[] args) {
      V v1 = new V("Avanish",48);
      v1.showDetails();
      v1.setAge(20);
      v1.showDetails();
    }
}
