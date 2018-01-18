package com.avanseus.algorithms;

import java.lang.reflect.Array;

public class MergeSort {
    public MergeSort() {
    }

    public void sort(int array[], int low, int high){
        int n = high - low;
        if (n<2) return;
        System.out.println("---------"+n);
        int mid = low + n / 2;
        sort(array,low,mid);
        sort(array,mid,high);
        System.out.println("___________________");
//        mergeSort(array,array);


        int[] temp = new int[n];
        int i = low, j = mid;
        for (int k = 0; k < n; k++)
        {
            if (i == mid)
                temp[k] = array[j++];
            else if (j == high)
                temp[k] = array[i++];
            else if (array[j]<array[i])
                temp[k] = array[j++];
            else
                temp[k] = array[i++];
        }
        for (int k = 0; k < n; k++)
            array[low + k] = temp[k];
        for (int k1 : array){
            System.out.println(k1);
        }
    }

    /*public void mergeSort(int[] leftArray,int[] rightArray){
        int n = leftArray.length + rightArray.length;
        int array[] = new int[n];
        int i=0,j=0,k = 0;
        while (i < leftArray.length && j < rightArray.length){
            if (leftArray[i] < rightArray[j]){
                array[k] = rightArray[i];
                i++;
            }else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i<leftArray.length){
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j<rightArray.length){
            array[k] = rightArray[j];
            j++;
            k++;
        }

        for (int k1 : array){
            System.out.println(k1);
        }
    }
*/
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int array[] = {10,20,25,2,7,3};
        mergeSort.sort(array,0,array.length);
    }
}
