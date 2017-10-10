package com.ds.practice.search;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLinear {
    @Test
    public void testEmptyArray () {
        assertFalse(Linear.isNumberInArray(new int[]{}, 5));
    }

    @Test
    public void testNullArray () {
        assertFalse(Linear.isNumberInArray(null, 5));
    }

    @Test
    public void testPositiveSearch () {
        assertTrue(Linear.isNumberInArray(new int[]{7,5,4,8,2,0,-1,5,-8,-5}, 5));
    }

    @Test
    public void testNegativeSearch () {
        assertFalse(Linear.isNumberInArray(new int[]{7,4,8,2,0,-1,-8,-5}, 5));
    }
}
