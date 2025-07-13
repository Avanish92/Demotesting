package com.lara;

public class Prac144 {
    public static void main(String[] args) {
        String s = "Welcome";
        s.concat("to java");
        System.out.println(s);//Strings are immutable in nature.once it's created it's can't be changed.

        StringBuffer sb = new StringBuffer("Welcome");
        sb.append(" to java");
        System.out.println(sb);//StringBuffer are mutable in nature.

        StringBuilder sbl =new StringBuilder("Welcome");
        sbl.append(" to java");
        System.out.println(sbl);//Stringbuilder are also mutable in nature.
        }
}
