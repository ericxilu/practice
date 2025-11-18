package com.lucrortek.hackerrank.prep.week1.day1;

import java.util.Scanner;

public class UniqueCharacter {

    private static boolean isUniqueCharsSolution1(String s) {
        System.out.println("***is unique chars solution 1");
        boolean[] uniqueCharTracker = new boolean[128];

        for (int i = 0; i < s.length(); i++) {

            if (uniqueCharTracker[s.charAt(i)]) {
                System.out.printf("found dup char %s\n", s.charAt(i));
                return false;
            }
            uniqueCharTracker[s.charAt(i)] = true;

        }
        System.out.println("end is unique char solution 1");

        return true;
    }

    private static boolean isUniqueCharsSolution2(String s){
        System.out.println("****is unique chars solution 2");
        int i=0, j=0;

        for( i=0; i<s.length()-1; i++){
            for ( j=i+1; j<s.length(); j++){
                System.out.printf("comparing i %s j %s\n", s.charAt(i), s.charAt(j));
                if(s.charAt(i)==s.charAt(j)) {
                    System.out.printf("i is %d j is %d\n", i, j);
                    return false;
                }
            }
        }
        System.out.printf("i is %d j is %d\n", i, j);

        return true;


    }

    private static void printOutcome(String str, boolean uniqueCharOnly) {
        if (uniqueCharOnly)
            System.out.printf("String %s only contains unique characters\n", str);
        else
            System.out.printf("String %s has duplicate characters\n", str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("get String to check unique character ");
        String str = scanner.nextLine();
        printOutcome(str, isUniqueCharsSolution1(str));
        printOutcome(str, isUniqueCharsSolution2(str));


    }
}
