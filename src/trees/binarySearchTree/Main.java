package trees.binarySearchTree;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args []){
        List<Integer> arr = Arrays.asList(25,20,15,27,30,29,26,22,32);
        Tree intTree = new Tree();
        for(var item : arr){
            intTree.insert(item);
        }
        // Display if Insert is Complete
        System.out.println("Insert Complete");
        intTree.printInOrder();
        System.out.println();
        /*intTree.get(29);
        System.out.println();
        intTree.getMaxMin();*/
        intTree.delete(15);
        intTree.delete(27);
        intTree.printInOrder();
    }
}
