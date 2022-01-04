package Lists.LinkedLists.DoubleLL;

import Lists.Employee;

public class EmployeeDLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    //Add the node to Front of linked List
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        if(head == null){
            tail = node;
        } else {
            head.setPrev(node);
        }
        head = node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if(tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
        }
        tail = node;
        size++;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode node = head;
        if(node.getNext() == null){
            tail = null;
        } else {
            tail = node.getNext();
        }
        head = head.getNext();
        node.setNext(null);
        size --;
        return node;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.println(" HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.println("<->");
            current = current.getNext();
        }
        System.out.print("-> Null");
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty() {
        EmployeeNode currentNode = head;
        if (currentNode == null) {
            return true;
        } else {
            return false;
        }
    }

    public EmployeeNode removeFromEnd(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode node = tail;
        if(tail == null){
            head = null;
        } else {
            tail.getPrev().setNext(null);
        }
        tail = tail.getPrev();
        node.setPrev(null);
        size --;
        return node;
    }
}
