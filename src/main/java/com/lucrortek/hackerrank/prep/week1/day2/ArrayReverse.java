package com.lucrortek.hackerrank.prep.week1.day2;

public class ArrayReverse {
    // Reverse the array in-place
    // Test with [1, 2, 3, 4, 5] → should become [5, 4, 3, 2, 1]

    public static void reverseArray(int[] arr) {

        int arrLen = arr.length;

        //set two pointers, and initialize them, left is beginning index, right is end index
        int left = 0;
        int right =arrLen - 1;


        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    
    

    public static void main (String[] args) {

        testOddLengthArr();

        testEvenLengthArr();

        testEmptyhArr();
    }

    private static void testOddLengthArr() {
        System.out.println("#test odd length array reversal");
        int[] arr = {1,2,3,4,5};

        System.out.println("original array");
        printArr(arr);

        System.out.println("revsed array");
        reverseArray(arr);
        printArr(arr);
    }

    private static void testEvenLengthArr() {
        System.out.println("#test even length array reversal");
        int[] arr = {1,2,3,4};

        System.out.println("original array");
        printArr(arr);

        System.out.println("revsed array");
        reverseArray(arr);
        printArr(arr);
    }

    private static void testEmptyhArr() {
        System.out.println("#test empty array reversal");
        int[] arr = {};

        System.out.println("original array");
        printArr(arr);

        System.out.println("revsed array");
        reverseArray(arr);
        printArr(arr);
    }



    private static void printArr(int[] arr) {
        for(int num : arr) {
            System.out.println(num);
        }
    }
}
