package Sorting.Insertion;
//Worst Case O(n^2), Average Case O(n^2), Best Case O(n). It's faster than Bubble Sort.
public class Insertion {
    static int key, j;
    public static void sort(int[] table){
        if(table.length < 2){
            return;
        }
        for(int i=1; i<table.length; i++){
            key = table[i];
            j = i - 1;
            while(j >= 0 && table[j] > key)
            {
                table[j+1] = table[j];
                j--;
            }
            table[j+1] = key;
        }
    }
}
