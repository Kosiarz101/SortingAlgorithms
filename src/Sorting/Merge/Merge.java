package Sorting.Merge;
//O(n*logn) in all cases
public class Merge {
    public static void merge(int arr[], int a, int q, int b){
        //ustalenie wielkosci tabel
        int n1 = q - a + 1;
        int n2 = b - q;
        //tworzenie tabel tymczasowych
        int l[] = new int[n1];
        int r[] = new int[n2];
        //kopiowanie danych to tymczasowych tabel
        for (int i=0; i< n1; i++){
            l[i]=arr[a+i];
        }
        for (int j=0; j<n2; j++) {
            r[j] = arr[q+1+j];
        }
        int i = 0, j = 0;
        int a2 = a;
        //porzadkowanie
        while(i<n1 && j< n2){
            if(l[i]<=r[j]){
                arr[a2] = l[i];
                i++;
            }
            else {
                arr[a2] = r[j];
                j++;
            }
            a2++;
        }
        //przepisywanie pozostalych w tabelach elementow
        while (i < n1){
            arr[a2] = l[i];
            i++;
            a2++;
        }
        while (j < n2) {
            arr[a2] = r[j];
            j++;
            a2++;
        }
    }
    public static void sort(int arr[], int a, int b){
        if(a<b){
            //znajdywanie punktu srodkowego
            int q = (a+b)/2;
            //sortowanie dwoch polowek
            sort(arr, a, q);
            sort(arr, q+1, b);
            //scalic polowki
            merge(arr, a, q, b);
        }
    }
}
