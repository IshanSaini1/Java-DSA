package queue.simple;

import queue.Employee;

public class ArrayQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        Employee newEmployee = employee;
        if (back == queue.length) {
            //Adjust the Backing Array.
            Employee[] newArr = new Employee[2 * queue.length];
            System.arraycopy(queue, 0, newArr, 0, queue.length);
            queue = newArr;
        }
        queue[back] = newEmployee;
        back++;
    }

    public Employee remove() {
        if (isEmpty()) {
            throw new StackOverflowError();
        }
        Employee removedNode = queue[front];
        queue[front] = null;
        front++;
        if (getSize() == 0) {
            front = 0;
            back = 0;
        }
        return removedNode;
    }

    public Employee peek(){
        if(isEmpty()){
            return null;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return (back - front) == 1;
    }

    public int getSize() {
        return (back - front);
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}
