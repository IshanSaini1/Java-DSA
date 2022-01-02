package Lists.LinkedLists.SingleLL;

import Lists.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    //Add the node to Front of linked List
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    //Printing a linked List
    public void printList() {
        EmployeeNode current = head;
        System.out.println(" HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.println("->");
            current = current.getNext();
        }
        System.out.print("-> Null");
    }

    //Returns the Size of the Array
    public int getSize() {
        return this.size;
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

    public EmployeeNode deleteFirstNode(){
        EmployeeNode currentNode = head;
        EmployeeNode nextNode = currentNode.getNext();
        head = nextNode;
        size--;
        //Cleaning References of Original Parent
        currentNode.setNext(null);
        return currentNode;
    }

}
