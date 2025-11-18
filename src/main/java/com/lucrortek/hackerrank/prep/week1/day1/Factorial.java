package com.lucrortek.hackerrank.prep.week1.day1;

public class Factorial {

    public static long factorial(int n) {
        long f = 1;

        if (n == 0)
            f = 1;
        else {
            for (int i = 2; i <= n; i++) {
                f =  f * i;
            }
        }

        return f;
    }
    public static void main(String[] args){

        System.out.printf("Factorial %d is %d%n", 5, factorial(5));

    }
}
