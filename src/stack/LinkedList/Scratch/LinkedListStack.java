package stack.LinkedList.Scratch;

import stack.Employee;

import java.util.EmptyStackException;

public class LinkedListStack {

    //In this implementation head = top
    private EmployeeNode head;
    private int size;

    public void push(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        EmployeeNode removeNode = head;
        head = removeNode.getNext();

        removeNode.setNext(null);
        size--;
        return removeNode.getEmployee();
    }

    public Employee peek(){
        EmployeeNode checkNode = head;
        return checkNode.getEmployee();
    }

    //Return if the Linked List is Empty or Not
    public boolean isEmpty() {
        EmployeeNode currentNode = head;
        if (currentNode == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getSize(){
        return size;
    }

    public void printStackList(){
        EmployeeNode current = head;
        while(current!=null){
            System.out.println(current);
            current =current.getNext();
        }
    }
}
