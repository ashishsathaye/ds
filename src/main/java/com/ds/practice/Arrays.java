package com.ds.practice;

import sun.invoke.empty.Empty;

public interface Arrays<T> {
    default void printArray (T[] arr)  {
        if (arr == null || arr.length == 0) {
            System.out.println("Null or Empty array");
            return;
        }

        for (T i : arr) {
            System.out.println(i);
        }
    }

    default boolean containsElements (T[] arr) throws EmptyArrayException {
        if(arr!=null && arr.length >0) {
            return true;
        }
        throw new EmptyArrayException();
    }
}
