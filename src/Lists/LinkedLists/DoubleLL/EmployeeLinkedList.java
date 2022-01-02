package Lists.LinkedLists.DoubleLL;

import Lists.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    //Add the node to Front of linked List
    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
    }

}
