package com.ds.practice.sort;

import com.ds.practice.EmptyArrayException;

public class Insertion implements Sort<Integer> {
    @Override
    public void sort(Integer[] arrToSort) throws EmptyArrayException {
        if (containsElements(arrToSort)) {
            for (int i = 1; i < arrToSort.length; i++) {
                int key = arrToSort[i];
                int j = i - 1;
                if (key < arrToSort[j]) {
                    while (j >= 0 && arrToSort[j] > key) {
                        arrToSort[j + 1] = arrToSort[j];
                        j--;
                    }
                    arrToSort[j+1] = key;
                }
            }
        }
    }
}
