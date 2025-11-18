package com.lucrortek.hackerrank.prep.week1.day1;

public class Fibonacci {

    public static int fibonacciIterative(int n) {

        if (n==0)
            return 0;

        if (n==1)
            return 1;

        int f_n_min_2 = 0;
        int f_n_min_1 = 1;
        int fib = 0;
        for (int i=2; i<=n; i ++) {
            fib = f_n_min_2 + f_n_min_1;
            f_n_min_2 = f_n_min_1;
            f_n_min_1 = fib;
        }

        return fib;
    }

    public static void main (String args[]) {
        System.out.printf("fibonacci %d is %d", 5, fibonacciIterative(5));

        for (int i=0; i<= 5; i++) {
            System.out.println(fibonacciIterative(i));
        }
    }

}
