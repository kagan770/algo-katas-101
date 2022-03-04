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

    @org.junit.Test
    public void test4() {
        inputArray = new int[]{1, 2, 3, 0};
        int actual = product.solution(inputArray);
        assertEquals(6, actual);
    }

    @org.junit.Test
    public void test5() {
        inputArray = new int[]{9, 5, 10, 2, 24, -1, -48};
        int actual = product.solution(inputArray);
        assertEquals(50, actual);
    }

    @org.junit.Test
    public void test6() {
        inputArray = new int[]{5, 6, -4, 2, 3, 2, -23};
        int actual = product.solution(inputArray);
        assertEquals(30, actual);
    }

    @org.junit.Test
    public void test7() {
        inputArray = new int[]{4, 1, 2, 3, 1, 5};
        int actual = product.solution(inputArray);
        assertEquals(6, actual);
    }

    @org.junit.Test
    public void test8() {
        inputArray = new int[]{-23, 4, -3, 8, -12};
        int actual = product.solution(inputArray);
        assertEquals(-12, actual);
    }

    @org.junit.Test
    public void test9() {
        inputArray = new int[]{1, 0, 1, 0, 1000};
        int actual = product.solution(inputArray);
        assertEquals(0, actual);
    }
}