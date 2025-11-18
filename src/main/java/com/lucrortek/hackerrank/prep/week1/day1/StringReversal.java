package com.lucrortek.hackerrank.prep.week1.day1;

public class StringReversal {
    public static String stringReversal(String s){
        StringBuffer sb = new StringBuffer();
        for (int i=s.length()-1; i>=0; i--) {
//            System.out.println(s.charAt(i));
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.printf ("reverse String %s is \"%s\"", "hello", stringReversal("hello"));
    }
}
