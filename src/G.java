public class G {

    public static void main(String[] args) {
        String s1 = "I love java programminga";
        int totallength = s1.length();
        int lengthafterremovingch = s1.replace("a","").length();
        int cout = totallength-lengthafterremovingch;
        System.out.println(cout);
    }
}
