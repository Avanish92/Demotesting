import java.util.*;
import java.util.Map.Entry;
public class H {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put(1,"Apple");
        m1.put(2,"Banana");
        m1.put(3,"Cherry");

        System.out.println("Value of key 2:"+ m1.get(2));//banana

        System.out.println("Contains key 3:"+m1.containsKey(3));//true

        System.out.println("Contains value Orange:"+m1.containsValue("orange"));




    }
}
