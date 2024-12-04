package src.main.java.dsaprogram;

import java.util.Arrays;

/*
arr1=[1,2,3];
arr2=[1,2,3];
both array must be in sorted order
 */
public class TwoWayMerging {

    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={0,1,2,3,4,5};

        twoWayMerging(arr1,arr2);
    }

    private static void twoWayMerging(int[] arr1, int[] arr2) {
        int arr3[]=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length){

            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }

        }
        //copy arr1 rest element to arr3
        if(i<arr1.length){
            while (i<arr1.length){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
        }
        //copy arr1 rest element to arr3
        if(j<arr2.length){
            while (j<arr2.length){
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }
        //print sorted array
        Arrays.stream(arr3).forEach(ele->System.out.print(ele+" "));
    }

}
