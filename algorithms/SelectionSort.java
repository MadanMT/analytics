package com.avanseus.algorithms;

public class SelectionSort {

    public SelectionSort() {
    }

    public void sort(int array[], int n){
        for (int i=0;i<n-1;i++ ){
            int min = array[i];
            int minj = i;
            for (int j = i+1;j<n;j++){
                if (array[j] < min){
                    min = array[j];
                    minj = j;
                }
            }
            array[minj] = array[i];
            array[i] = min;
            System.out.println("__________________________________________");
                for (int k : array){
                    System.out.println(k);
                }
        }

    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int array[] = {30,0,-40,7,18,-8};
//        int array[] = {0 ,7 ,8,18,30,40};
        selectionSort.sort(array,array.length);
    }
}
