package src.main.java.dsaprogram;

public class BubbleSort {
    /*
    arr[5,4,3,2,1]
    i=1 j=0,1,2,3  set max element 5 at end
    i=2 j=0,1,2  set max element 4 at end
    i=3 j=0,1  set max element 3 at end
    ...
     */
    public static void main(String[] args) {
        int arr[]= {8,0,5,0,7,8,2,4,3,2,9,1,0};
        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.bubbleSortCode(arr);
    }

    private void bubbleSortCode(int[] arr) {
        boolean isArraySotred=true;
        for (int i=1;i<=arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    isArraySotred=false;
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
            if(isArraySotred)
                break;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
