package com.ds.practice.sort;

import com.ds.practice.Arrays;
import com.ds.practice.EmptyArrayException;

public interface Sort<T> extends Arrays {
    void sort (T[] arrToSort) throws EmptyArrayException;

    default void swap (T arr[], int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
