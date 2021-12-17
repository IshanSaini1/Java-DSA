package sorting;

import java.util.Arrays;

public class SelectionSort
{
    public static void main(String args[]){
        Integer[] arr = new Integer[]{20,35,-15,7,55,1,-22};
        //Implementing Selection Sort Below :
        //Loop for cycles
        for(int unsortedListPartIndex = arr.length-1; unsortedListPartIndex>0;unsortedListPartIndex--){
            int maxValueIndex = 0;
            //Loop for cycle Steps
            for(int i=1;i<=unsortedListPartIndex;i++){
                //check if value is greater than max value
                if(arr[i]>arr[maxValueIndex]){
                    maxValueIndex = i;
                }
            }
            //Swap the Max Element with the element at end of unsorted partition of array
            swap(arr,maxValueIndex,unsortedListPartIndex);
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
