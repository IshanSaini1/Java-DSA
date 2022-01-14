package heaps;

public class Main {
    public static void main(String args[]) {
        Heap heap = new Heap(10);
        heap.insert(22);
        heap.insert(19);
        heap.insert(18);
        heap.insert(15);
        heap.insert(3);
        heap.insert(14);
        heap.insert(4);
        heap.insert(12);
        heap.insert(20);

        heap.printHeap();
        System.out.println();
        System.out.println("Deleted : "+heap.delete(4));
        heap.printHeap();
    }

}
