package src.main.java.dsaprogram;

public class SelectionSort {
    /*
    arr[5,4,3,2,1]
    i=0 j=1,2,3,4  set min element 1 at first 0 index
    i=1 j=2,3,4  set 2nd min element 2 at 1 index
    i=2 j=3,4  set 2nd min element 3 at 2 index
    ...
     */
    public static void main(String[] args) {
        int arr[]= {1,5,4,9,3,7,2};
        SelectionSort selectionSort=new SelectionSort();
        selectionSort.sort(arr);
    }



    private void sort(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }

        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}

