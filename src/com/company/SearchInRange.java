package com.company;

public class SearchInRange {
    public static void main(String[] args) {
    int[] arr = {18, 23, 45, 67, 99, -6};
    int target = 23;
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = start; index <= end; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        return -1;
    }
}