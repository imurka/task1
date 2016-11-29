package com.fourfinance.qa;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest
{

    @Test
    public void testDescValues() throws Exception
    {
        BubbleSort sort = new BubbleSort(new int[] {7,6,5,4,3,2,1,0});
        int[] sorted = sort.sort();
        assertEquals("[0, 1, 2, 3, 4, 5, 6, 7]", Arrays.toString(sorted));
    }

    @Test
    public void testMixValues() throws Exception
    {
        BubbleSort sort = new BubbleSort(new int[] {0,12,5,76,2,3,6,13,1});
        int[] sorted = sort.sort();
        assertEquals("[0, 1, 2, 3, 5, 6, 12, 13, 76]", Arrays.toString(sorted));
    }

    @Test
    public void testDuplicateValues() throws Exception
    {
        BubbleSort sort = new BubbleSort(new int[] {8,8,3,1,5,1,1,0});
        int[] sorted = sort.sort();
        assertEquals("[0, 1, 1, 1, 3, 5, 8, 8]", Arrays.toString(sorted));
    }

    @Test
    public void testEmptyArray() throws Exception
    {
        BubbleSort sort = new BubbleSort(new int[] {});
        int[] sorted = sort.sort();
        assertEquals("[]", Arrays.toString(sorted));
    }

    @Test
    public void testEqualValues() throws Exception
    {
        BubbleSort sort = new BubbleSort(new int[] {8,8,8,8,8});
        int[] sorted = sort.sort();
        assertEquals("[8, 8, 8, 8, 8]", Arrays.toString(sorted));
    }

    @Test
    public void testMaxValues() throws Exception
    {
        BubbleSort sort = new BubbleSort(new int[] {Integer.MAX_VALUE,Integer.MIN_VALUE,8,8,8});
        int[] sorted = sort.sort();
        assertEquals("["+Integer.MIN_VALUE+", 8, 8, 8, "+Integer.MAX_VALUE+"]", Arrays.toString(sorted));
    }

    @Test
    public void testNegatValues() throws Exception
    {
        BubbleSort sort = new BubbleSort(new int[] {6,-3,0,8,-1});
        int[] sorted = sort.sort();
        assertEquals("[-3, -1, 0, 6, 8]", Arrays.toString(sorted));
    }
}

