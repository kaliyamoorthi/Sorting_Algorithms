package com.SortingAlgos;

import java.util.ArrayList;

public class MergeSort {
    public static void mergeSort(ArrayList<Integer> Arr){
        int l, r;
        l= 0;
        r= Arr.size()-1;
        divideArr(Arr,l,r);
    }
    public static void divideArr(ArrayList<Integer> Arr, int l , int r){
        int m = (l+r)/2;
        if (l<r) {
            divideArr(Arr, l, m);
            divideArr(Arr, m + 1, r);
            mergeArr(Arr,l,m,r);
            System.out.println("During Sorting: "+ Arr);
        }
    }

    public static void mergeArr(ArrayList<Integer> Arr, int l, int m , int r) {
        int i = 0, j = 0;
        int k = l;
        Integer[] lArr = new Integer[m - l + 1];
        Integer[] rArr = new Integer[r - m];

        for (i = 0; i < lArr.length; i++) {
            lArr[i] = Arr.get(l + i);
        }
        for (i = 0; i < rArr.length; i++) {
            rArr[i] = Arr.get(m + 1 + i);
        }

        i = 0;

        while (i < lArr.length && j < rArr.length) {
            if (lArr[i] < rArr[j]) {
                Arr.set(k, lArr[i]);
                i++;
            } else {
                Arr.set(k, rArr[j]);
                j++;
            }
            k++;

        }
        while (i < lArr.length) {
            Arr.set(k, lArr[i]);
            i++;
            k++;
        }
        while (j < rArr.length) {
            Arr.set(k, rArr[j]);
            j++;
            k++;
        }
    }

}
