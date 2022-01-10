package SearchAlgos;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4, 8, 2, -11, 54, 7, 'a'};
        printArr(arr);
        System.out.println();
        System.out.println("Please Enter the number to Search ?");
        int item = sc.nextInt();
        int itemFound = LinearSearch(arr,item);
        System.out.println("The array to search within is as :");
        if(itemFound >= 0){
            System.out.println("Item found @ index : "+itemFound);
        } else {
            System.out.println("Item Not Available in Array");
        }
    }

    private static int LinearSearch(int arr[], int item) {
        int atIndex = -1;

        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                atIndex = i;
                break;
            }
        }
        return atIndex;
    }

    private static void printArr( int arr[]){
        for(var i : arr){
            System.out.print(" ["+i+"] ");
        }
    }
}
