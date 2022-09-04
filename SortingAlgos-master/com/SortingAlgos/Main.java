package com.SortingAlgos;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

import static com.SortingAlgos.InsertionSort.insertion_Sort;
import static com.SortingAlgos.MergeSort.mergeSort;
import static com.SortingAlgos.QuickSort.quickSort;
import static com.SortingAlgos.RadixSort.radixSort;

public class Main {




    public static void main(String[] args) {
        ArrayList <Integer> inArray = new ArrayList<Integer>(List.of(9,7,5,4,3,2,1,0));
        System.out.println("Before Sorting: "+ inArray);
        //insertion_Sort(inArray);
        //quickSort(inArray);
        //mergeSort(inArray);
        radixSort(inArray);
        System.out.println("After Sorting: "+ inArray);

    }

}
