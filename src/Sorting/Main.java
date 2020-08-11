package Sorting;

import Sorting.Insertion.Insertion;
import Sorting.Merge.Merge;
import Sorting.Quick.Quick;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
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
