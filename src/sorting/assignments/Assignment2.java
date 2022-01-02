package sorting.assignments;

//Recursive Insertion Sort
public class Assignment2 {

    public static void main(String args[]) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        insertionSortRecursion(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }
    }

    private static void insertionSortRecursion(int[] input, int numElements) {
        if (numElements < 2) {
            return;
        }
        insertionSortRecursion(input, numElements - 1);
        int insertElement = input[numElements - 1];
        int i;
        for (i = numElements - 1; i > 0 && input[i - 1] > insertElement; i--) {
            input[i] = input[i - 1];
        }
        input[i] = insertElement;
    }

}
