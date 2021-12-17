package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String args[]) {
        Integer[] arr = new Integer[]{20, 35, -15, 7, 55, 1, -22};
        //Implementing Insertion sort.
        for(int unsortedListIndex = 1;unsortedListIndex<arr.length;unsortedListIndex++){
            int newElement = arr[unsortedListIndex];
            int i;
            for(i = unsortedListIndex;i>0 && arr[i-1]>newElement;i--){
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }

        Arrays.asList(arr).stream().forEach(o -> System.out.println(o));
    }
}
