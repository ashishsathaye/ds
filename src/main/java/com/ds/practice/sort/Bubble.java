package com.ds.practice.sort;

import com.ds.practice.EmptyArrayException;

public class Bubble implements Sort<Integer> {

    @Override
    public void sort(Integer[] arrToSort) throws EmptyArrayException {
        if(containsElements(arrToSort)) {
            for (int i = 0; i < arrToSort.length; i++) {
                for (int j = 0; j < arrToSort.length - 1; j++) {
                    if (arrToSort[j] > arrToSort[j + 1]) {
                        swap(arrToSort, j, j+1);
                    }
                }
            }
            printArray(arrToSort);
        }
    }
}
