package stack.LinkedList.Scratch;

import stack.Employee;

public class LinkedListImpl {
    public static void main(String args[]) {

        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(567, "John", "Doe");
        Employee marySmith = new Employee(890, "Mary", "Smith");
        Employee mikeWilson = new Employee(112, "Mike", "Wilson");
        Employee billEnd = new Employee(114, "Bill", "End");

        LinkedListStack stack = new LinkedListStack();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(mikeWilson);
        stack.printStackList();
        System.out.println("Check at Top : ");
        System.out.println(stack.pop());
        System.out.println("After Removal");
        stack.printStackList();
    }
}
