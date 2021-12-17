package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        Integer[] arr = new Integer[]{20,35,-15,7,55,1,-22};
        //Number of cycles required to Sort this list
        for(int partitionIndex = arr.length-1;partitionIndex>0;partitionIndex--){
            //Number of internal steps in the cycles.
            for(int i = 0;i<partitionIndex;i++){
                //For Ascending Order
                if(arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
        Arrays.asList(arr).stream().forEach(o -> System.out.println(o));
    }

    public static void swap(Integer[] arr, int i, int j){
        //Check if i == j
        if(i == j){
            return;
        }
        Integer temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
