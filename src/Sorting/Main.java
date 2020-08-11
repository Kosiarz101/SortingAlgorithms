package Sorting;

import Sorting.Insertion.Insertion;
import Sorting.Merge.Merge;
import Sorting.Quick.Quick;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int arr[] = {5,3,4,2,1,6};
        //fillTheArray(arr);
	    printarray(arr);
	    long tStart = System.nanoTime();
        //Merge mr = new Merge();
	    // mr.sort(arr, 0, arr.length - 1);
        //Insertion.sort(arr);
        Quick.sort(arr, 0, arr.length-1);
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
