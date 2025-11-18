package com.lucrortek.hackerrank.prep.week1.day1;

public class PrimeNumberCheck {
    public static boolean isPrime(int n){
        if (n==0 || n==1) {
            return false;
        } else if (n==2) {
            return true;
        } else {
            boolean isPrime = true;
            for (int i=2; i<n; i++) {
                if (n%i == 0)
                    return false;
            }
            return isPrime;
        }
    }

    public static void main (String args[]) {
        System.out.printf("%d is prime check is %b%n", 17, isPrime(17));
        System.out.printf("%d is prime cehck is %b%n", 15, isPrime(15));
    }
}
