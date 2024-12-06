package src.main.java.dsaprogram;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={9,0,1,5,9,4,3,6};
        QuickSort quickSort=new QuickSort();
        quickSort.sort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
    }

    private void sort(int[] arr, int l, int h) {
        if (l<h){
            int pivotIndex=partition(arr,l,h);
            sort(arr,l,pivotIndex-1);
            sort(arr,pivotIndex+1,h);
        }
    }

    private int partition(int[] arr, int l, int h) {
        int pivotIndex=h;//****
        int i=0;
        for(int j=0;j<arr.length;j++){
            //if element less than pivotelement shift to left or intterghane with i
            if(arr[j]<arr[pivotIndex]){
               int t=arr[i];
               arr[i]=arr[j];
               arr[j]=t;
               i++;
            }
        }
        //set pivot elemnt to i index;
        int t=arr[i];
        arr[i]=arr[pivotIndex];
        arr[pivotIndex]=t;
        pivotIndex=i;
        return pivotIndex;
    }
}
