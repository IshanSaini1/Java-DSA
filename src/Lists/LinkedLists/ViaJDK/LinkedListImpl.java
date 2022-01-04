package Lists.LinkedLists.ViaJDK;

import Lists.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImpl {

    public static void main(String args[]) {
        Employee janeJones = new Lists.Employee(123, "Jane", "Jones");
        Employee johnDoe = new Lists.Employee(567, "John", "Doe");
        Employee marySmith = new Lists.Employee(890, "Mary", "Smith");
        Employee mikeWilson = new Employee(112, "Mike", "Wilson");
        Employee billEnd = new Employee(114,"Bill","End");
        //Initializing a linked List

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);
        list.addLast(billEnd);
        printLinkedList(list);
    }

    private static void printLinkedList(LinkedList<Employee> list) {
        Iterator iter = list.iterator();
        System.out.println("HEAD ->");
        while (iter.hasNext()) {
            System.out.print(iter.next() + "<->");
            System.out.println();
        }
        System.out.println("-> null");
    }
}
