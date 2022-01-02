package Lists.LinkedLists.SingleLL;

import Lists.Employee;

public class SinglyLinkedList {
    public static void main(String args[]){
        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(567, "John", "Doe");
        Employee marySmith = new Employee(890, "Mary", "Smith");
        Employee mikeWilson = new Employee(112, "Mike", "Wilson");

        EmployeeLinkedList linkedList = new EmployeeLinkedList();

        //Adding the Employees to a linkedList
        linkedList.addToFront(janeJones);
        linkedList.addToFront(johnDoe);
        linkedList.addToFront(marySmith);
        linkedList.addToFront(mikeWilson);

        //Print the Linked List
        linkedList.printList();

        //Print Size of the List
        System.out.println();
        System.out.println("Size = "+linkedList.getSize());

        //Check if the Linked List is Empty or Not
        System.out.println();
        System.out.println("IsEmpty = "+linkedList.isEmpty());

        //Deleting Element from Front
        System.out.println();
        System.out.println("Deleted "+linkedList.deleteFirstNode());

        //Print the Linked List again to confirm deletion
        linkedList.printList();

    }
}
