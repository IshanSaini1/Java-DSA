package sorting;

import java.util.Arrays;

public class SortUsingJDK {
    public static void main(String args[]){
        int arr[] = {20,35,-15,7,55,1,-22};

        Arrays.sort(arr);
        Arrays.parallelSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
    }
}
