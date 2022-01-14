package heaps;

public class Heap {

    private int[] heap;
    private int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public Heap(int[] heap) {
        this.heap = heap;
    }

    public void insert(int item) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Heap is Full");
        }
        heap[size] = item;
        fixHeapAbove(size);
        size++;
    }

    private void fixHeapAbove(int indexOfItem) {
        int newValue = heap[indexOfItem];
        while (indexOfItem > 0 && newValue > heap[getParentIndex(indexOfItem)]) {
            heap[indexOfItem] = heap[getParentIndex(indexOfItem)];
            indexOfItem = getParentIndex(indexOfItem);
        }
        heap[indexOfItem] = newValue;
    }

    public void printHeap() {
        for (int i = 0; i < heap.length; i++) {
            System.out.print(" [" + heap[i] + "] ");
        }
    }

    public boolean isFull() {
        if (heap.length == size) {
            return true;
        } else {
            return false;
        }
    }

    public int delete(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is Empty : Deletion not possible");
        }
        int parent = getParentIndex(index);
        int deletedValue = heap[index];

        // replace deleted value with leftmost or last value
        heap[index] = heap[size - 1];

        // Heapify the heap to fix the structure
        if (index == 0 || heap[index] < heap[parent]) {
            fixHeapBelow(index, size - 1);
        } else {
            fixHeapAbove(index);
        }
        //Decrement the size and return deleted value
        size--;
        return deletedValue;
    }

    private void fixHeapBelow(int index, int lastHeapIndex) {
        int childToSwap;

        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            if (leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                } else {
                    childToSwap = (heap[rightChild] > heap[leftChild]) ? rightChild : leftChild;
                }
                if (heap[index] < heap[childToSwap]) {
                    int temp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = temp;
                } else {
                    break;
                }
                index = childToSwap;
            } else{
                break;
            }
        }
    }

    public int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getChild(int index, boolean left) {
        return (left) ? (2 * index) + 1 : (2 * index) + 2;
    }


}
