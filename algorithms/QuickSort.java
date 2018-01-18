package com.avanseus.algorithms;

public class QuickSort {

    public QuickSort() {
    }

    public void sort(int a[], int start,int end){
        if (start < end){
            int pIndex = partition(a,start,end);
            sort(a,start,pIndex-1);
            sort(a,pIndex+1,end);
        }
    }

    public int partition(int a[],int start,int end){
        int pivot = a[end];
        int pIndex = start;
        for (int i = 0; i<end;i++){
            if (a[i] <= pivot){
                int temp  = a[i];
                a[i] = pivot;
                a[pIndex] = temp;
                pIndex++;
            }
        }
        int temp  = a[pIndex];
        a[pIndex] = a[end];
        a[end] = temp;
        for (int k : a){
            System.out.print(k+" ");
        }
        System.out.println();
        return pIndex;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int a[] = {57,40,3,7,9,2,-10};
        int start = 0;
        int end = a.length-1;
        quickSort.sort(a,start,end);
    }
}
