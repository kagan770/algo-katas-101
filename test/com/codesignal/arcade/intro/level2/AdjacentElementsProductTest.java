package com.codesignal.arcade.intro.level2;

import static org.junit.Assert.*;

public class AdjacentElementsProductTest {

    AdjacentElementsProduct product = new AdjacentElementsProduct();
    int[] inputArray = {3, 6, -2, -5, 7, 3};

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void test1() {
        int actual = product.solution(inputArray);
        assertEquals(21, actual);
    }

    @org.junit.Test
    public void test2() {
        inputArray = new int[]{-1, -2};
        int actual = product.solution(inputArray);
        assertEquals(2, actual);
    }

    @org.junit.Test
    public void test3() {
        inputArray = new int[]{5, 1, 2, 3, 1, 4};
        int actual = product.solution(inputArray);
        assertEquals(6, actual);
    }
}