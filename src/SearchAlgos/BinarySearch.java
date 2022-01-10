package SearchAlgos;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {-22, -15, 1, 7, 20, 35, 55};
        printArr(arr);
        System.out.println();
        System.out.println("Please Enter the number to Search ?");
        int item = sc.nextInt();
        int itemFound = BinarySearch(arr, item);
        System.out.println("The array to search within is as :");
        if (itemFound >= 0) {
            System.out.println("Item found @ index : " + itemFound);
        } else {
            System.out.println("Item Not Available in Array");
        }
    }

    private static int BinarySearch(int arr[], int item) {
        int start = 0;
        int end = arr.length;
        while (start < end) {
            int midpoint = (start+end)/2;
            if(arr[midpoint] == item){
                return midpoint;
            } else if (arr[midpoint] > item ){
                end = midpoint;
            } else {
                start = midpoint + 1;
            }
        }
        return -1;
    }

    private static void printArr(int arr[]) {
        for (var i : arr) {
            System.out.print(" [" + i + "] ");
        }
    }
}
