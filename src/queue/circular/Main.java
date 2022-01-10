package queue.circular;

import queue.Employee;

public class Main {
    public static void main(String args[]) {
        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(567, "John", "Doe");
        Employee marySmith = new Employee(890, "Mary", "Smith");
        Employee mikeWilson = new Employee(112, "Mike", "Wilson");
        Employee billEnd = new Employee(114, "Bill", "End");

        ArrayQueue queue = new ArrayQueue(5);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(billEnd);
        queue.remove();
        queue.add(mikeWilson);
        queue.remove();
        queue.add((marySmith));
        queue.remove();
        queue.add(janeJones);
        queue.printQueue();
        System.out.println("Check what is at Front");
        System.out.println(queue.peek());
    }
}
