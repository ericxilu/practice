package com.lucrortek.hackerrank.prep.week1.day2;

// Return index of target, or -1 if not found
// Test with arr = [5, 2, 8, 1, 9], target = 8 → should return 2
public class ArraySearch {
    public static int linearSearch(int[] arr, int target) {

        int searchIndex = -1;

        int curIndex = 0;
        for (int num : arr ){
            if (target == num) {
                return curIndex;
            }
            curIndex++;
        }

        return searchIndex;
    }

    public static void main (String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        System.out.printf("found target %d at index %d", 8, linearSearch(arr, 8));
    }
}
