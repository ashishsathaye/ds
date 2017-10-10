package com.ds.practice.search;

public class Linear {
    static boolean isNumberInArray (int[] arr, int search) {
        if (arr == null) return  false;
        for (int i : arr) {
            if (i == search) {
                return true;
            }
        }
        return false;
    }
}
