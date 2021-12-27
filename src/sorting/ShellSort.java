package sorting;

import java.util.Arrays;

public class ShellSort {

    public static void main(String args[]){
        Integer[] arr = new Integer[]{20, 35, -15, 7, 55, 1, -22};
        // For activity Gap = length/2
        for(int gap = arr.length/2;gap>0;gap/=2){
            // Independent shifting for gaps
            for(int i = gap;i<arr.length;i++){
                int newElement = arr[i];
                int j = i;
                while((j>=gap) && (arr[j-gap]>newElement)){
                    arr[j] = arr[j-gap];
                    j-=gap;
                }
                arr[j] = newElement;
            }
        }

        Arrays.asList(arr).stream().forEach(o -> System.out.println(o));
    }
}
