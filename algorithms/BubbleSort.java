package com.avanseus.algorithms;


public class BubbleSort {
    public BubbleSort() {
    }

    public void sort(int array[],int n){
        for (int i = 0;i<n-1;i++){
            for (int j=i+1; j<n;j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i : array){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int array[] = {100,-30,250,10,2};
        bubbleSort.sort(array,array.length);
    }
}
