package com.avanseus.algorithms;

public class InsertionSort {
    public InsertionSort() {
    }

    public void sort(int array[], int n) {
        for (int i = 1; i < n; i++) {
            int key = array[i];
            for (int j = i - 1; j > -1; j--) {
                if (key < array[j]) {
                    array[j + 1] = array[j];
                    array[j] = key;
                }
            }
            System.out.println("---------------------------------------------");
            for (int k : array) {
                System.out.println(k);
            }

        }


    }

    public static void main(String[] args) {
        int array[] = {30, 0, -1, 200, 3};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array, array.length);
    }
}
