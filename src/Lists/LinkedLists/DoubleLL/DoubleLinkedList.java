package Lists.LinkedLists.DoubleLL;


import Lists.Employee;

public class DoubleLinkedList {
    public static void main(String args[]){
        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(567, "John", "Doe");
        Employee marySmith = new Employee(890, "Mary", "Smith");
        Employee mikeWilson = new Employee(112, "Mike", "Wilson");

        EmployeeDLinkedList doublyLinkedList = new EmployeeDLinkedList();
        doublyLinkedList.addToFront(janeJones);
        doublyLinkedList.addToFront(marySmith);
        doublyLinkedList.addToFront(mikeWilson);
       doublyLinkedList.addToEnd(johnDoe);

        doublyLinkedList.printList();
        System.out.println();
        System.out.println(doublyLinkedList.getSize());

        System.out.println("Testing Deletion at Front");
        System.out.println(doublyLinkedList.removeFromFront());
        doublyLinkedList.printList();
        System.out.println();

        //TODO : Correct it.
        System.out.println("Testing Deletion at End");
        System.out.println(doublyLinkedList.removeFromEnd());
        doublyLinkedList.printList();
        System.out.println();
    }
}
