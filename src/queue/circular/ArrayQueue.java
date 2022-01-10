package queue.circular;

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
        if (getSize() == queue.length - 1) {
            //Adjust Circular the Backing Array, need to unwrap the queue.
            int numItem = getSize();
            Employee[] newArr = new Employee[2 * queue.length];
            System.arraycopy(queue, front, newArr, 0, queue.length - front);
            System.arraycopy(queue, 0, newArr, queue.length - front, back);
            front = 0;
            back = numItem;
            queue = newArr;
        }
        queue[back] = newEmployee;

        if (back < queue.length - 1) {
            back++;
        } else {
            back = 0;
        }


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
        } else if (front == queue.length) {
            front = 0;
        }
        return removedNode;
    }

    public Employee peek() {
        if (isEmpty()) {
            return null;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return (back - front) == 1;
    }

    public int getSize() {
        if (front <= back) {
            return (back - front);
        } else {
            int front2End = queue.length - front;
            int start2Back = back;
            return (front2End + start2Back);
        }
    }

    public void printQueue() {
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
