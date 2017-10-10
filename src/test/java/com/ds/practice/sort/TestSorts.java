package com.ds.practice.sort;

import com.ds.practice.EmptyArrayException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSorts {

    Bubble bubble = new Bubble();
    Insertion insertion = new Insertion();

    @Test
    public void testEmpty() throws EmptyArrayException {
        Integer[] arr = new Integer[]{};
        assertThrows(EmptyArrayException.class, () -> bubble.sort(arr));
        assertThrows(EmptyArrayException.class, () -> insertion.sort(arr));
    }

    @Test
    public void testNull() throws EmptyArrayException {
        Integer[] arr = null;
        assertThrows(EmptyArrayException.class, () -> bubble.sort(arr));
        assertThrows(EmptyArrayException.class, () -> insertion.sort(arr));
    }

    @Test
    public void testSorted() throws EmptyArrayException {
        Integer[] arr = new Integer[] {1,2,3,4,5};
        bubble.sort(arr);
        assertArrayEquals (new Integer[] {1,2,3,4,5}, arr);
        insertion.sort(arr);
        assertArrayEquals (new Integer[] {1,2,3,4,5}, arr);
    }

    @Test
    public void testUnSorted() throws EmptyArrayException {
        Integer[] arr = new Integer[] {5,4,3,2,1};
        bubble.sort(arr);
        assertArrayEquals (new Integer[] {1,2,3,4,5}, arr);
        arr = new Integer[] {5,4,3,2,1};
        insertion.sort(arr);
        assertArrayEquals (new Integer[] {1,2,3,4,5}, arr);
    }

    @Test
    public void testRandom() throws EmptyArrayException {
        Integer[] arr = new Integer[] {2,3,1,5,4};
        bubble.sort(arr);
        assertArrayEquals (new Integer[] {1,2,3,4,5}, arr);
        arr = new Integer[] {2,3,1,5,4};
        insertion.sort(arr);
        assertArrayEquals (new Integer[] {1,2,3,4,5}, arr);
    }
}
