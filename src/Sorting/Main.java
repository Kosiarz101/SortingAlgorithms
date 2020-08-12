package Sorting;

import Sorting.Heap.Heap;
import Sorting.Insertion.Insertion;
import Sorting.Merge.Merge;
import Sorting.Quick.Quick;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[100];
        fillTheArray(arr);
	    printarray(arr);
	    long tStart = System.nanoTime();
        //Merge.sort(arr, 0, arr.length - 1);
        //Insertion.sort(arr);
        //Quick.sort(arr, 0, arr.length-1);
        Heap.sort(arr);
        long tEnd = System.nanoTime();
        long elapsedtime = tEnd - tStart;
        System.out.println("\n");
        printarray(arr);
        System.out.println("\nTime Elapsed: " + elapsedtime);
    }
    public static void printarray(int arr[]){
        for (byte i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void fillTheArray(int arr[]){
        Random number = new Random();
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = number.nextInt(100);
        }
    }
}
