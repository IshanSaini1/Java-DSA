package stack.array;

import stack.Employee;

import java.util.EmptyStackException;

public class ArrayStack {

    Employee[] stack;
    //top = 0
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == stack.length) {
            throw new StackOverflowError();
        }
        stack[top++] = employee;
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Employee removed = stack[--top];
        stack[top] = null;
        return removed;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Employee topNode = stack[top - 1];
        return topNode;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int getSize() {
        return top;
    }

    public void printStack(){
        for(int i=top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
