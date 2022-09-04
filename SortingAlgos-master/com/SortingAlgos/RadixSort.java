package com.SortingAlgos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RadixSort {
    public static int findMax(ArrayList<Integer> Arr){
        int max = Arr.get(0);
        for(int i=0; i<Arr.size();i++){
            if(Arr.get(i)> max){
                max=Arr.get(i);
                        
            }
        }
        return max;
    }
    public static void radixSort(ArrayList<Integer> Arr){
        int max = findMax(Arr);
        int exp =1;
        while(max/exp>0){
            countSort(Arr,exp);
            exp = exp*10;
            System.out.println("During Radix Sort:"+ Arr);
        }


    }
    public static void countSort(ArrayList<Integer> Arr, int exp){
        int count[] = new int[10],i=0;
        int size = Arr.size();
        ArrayList<Integer> output = new ArrayList<Integer>(Arr);
                //Collections.nCopies(size, 0));
        Arrays.fill(count,0);
        for(i =0; i<size;i++){
            count[(Arr.get(i)/exp)%10]++;
        }
        //Cumulative Sum
        for(i =1; i<10;i++){
            count[i]+=count[i-1];
        }
        //Build output
        for(i=size-1;i>=0;i--){
            int pos = count[(output.get(i)/exp)%10]-1;
            Arr.set(pos,output.get(i));
            count[(output.get(i)/exp)%10]--;
        }
        //return output;
    }

}
