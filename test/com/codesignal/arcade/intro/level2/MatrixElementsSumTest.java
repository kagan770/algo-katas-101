package com.codesignal.arcade.intro.level2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixElementsSumTest {

    @Test
    public void test1() {
        MatrixElementsSum x = new MatrixElementsSum();
        int[] input = {40, 50, 60, 10, 20, 30};
        boolean actual  = x.solution(input);
        assertEquals(false,actual);
    }

    @Test
    public void test2() {
        MatrixElementsSum x = new MatrixElementsSum();
        int[] input = {1,1};
        boolean actual  = x.solution(input);
        assertEquals(true,actual);
    }

    @Test
    public void test3() {
        MatrixElementsSum x = new MatrixElementsSum();
        int[] input = {1, 2, 5, 3, 5};
        boolean actual  = x.solution(input);
        assertEquals(true,actual);
    }

    @Test
    public void test4() {
        MatrixElementsSum x = new MatrixElementsSum();
        int[] input = {1, 2, 3, 4, 3, 6};
        boolean actual  = x.solution(input);
        assertEquals(true,actual);
    }

    @Test
    public void test5() {
        MatrixElementsSum x = new MatrixElementsSum();
        int[] input = {3, 5, 67, 98, 3};
        boolean actual  = x.solution(input);
        assertEquals(true,actual);
    }

//    @Test
//    public void test6() {
//        assertEquals(1,2);
//    }
//
//    @Test
//    public void test7() {
//        assertEquals(1,2);
//    }
//
//    @Test
//    public void test8() {
//        assertEquals(1,2);
//    }
//
//    @Test
//    public void test9() {
//        assertEquals(1,2);
//    }
//
//    @Test
//    public void test10() {
//        assertEquals(1,2);
//    }
}