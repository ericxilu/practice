package com.lucrortek.hackerrank.prep.week1.day1;

public class ArraySum {

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i=0; i< array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String args []) {
        int[] ary = {1,2, 3, 4, 5};
        System.out.printf("array sum [1,2,3,4,5] equals %d", arraySum(ary) );
    }
}
