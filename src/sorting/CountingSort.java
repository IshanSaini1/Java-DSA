package sorting;

public class CountingSort {
    public static void main(String args[]){
        int[] arr = {2,5,9,8,2,8,7,10,4,3};
        // Implement counting sort
        int[] countingArray = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<arr.length;i++){
            countingArray[arr[i]-1]+=1;
        }
        int j =0;
        for(int i = 1;i<=10;i++){
            while(countingArray[i-1]>0){
                arr[j++] = i;
                countingArray[i - 1]--;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
    }
}
