package com.company;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 778, 788};
        System.out.println(max(arr));
        
    }
    // imagine that arr is not empty
    static int max(int[] arr){
        int maxVal = arr [0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] > maxVal){
            }
            maxVal = arr[i];
            
        }
            return maxVal;
    }
}
