package com.fourfinance.qa;

class BubbleSort
{

    private int[] array;

    BubbleSort(int[] array)
    {
        this.array = array;
    }

    public int[] sort()
    {
        final int n = array.length;
        for (int pass = 1; pass < n; pass++) {
            for (int i = 0; i < n - pass - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}
