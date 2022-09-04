package com.SortingAlgos;

import java.util.ArrayList;

public class InsertionSort  {
    public static void insertion_Sort(ArrayList<Integer> Arr){
        int size = Arr.size();
        if (size > 1){
            int i=0,k, key;
            while (i < size-1){
                key = Arr.get(i + 1);
                k = i;
                while (k >-1 && key< Arr.get(k)){
                    Arr.set(k+1,Arr.get(k));
                    k--;
                    System.out.println("During Sorting: "+ Arr);
                }
                Arr.set(k+1, key);
                //System.out.println(i+1);
                i++;
                System.out.println("During Sorting: "+ Arr);
            }

        }
    }
}
