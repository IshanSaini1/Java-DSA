package stack.array;

import stack.Employee;

public class ArrayStackImpl {
    public static void main(String args[]) {
        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(567, "John", "Doe");
        Employee marySmith = new Employee(890, "Mary", "Smith");
        Employee mikeWilson = new Employee(112, "Mike", "Wilson");
        Employee billEnd = new Employee(114, "Bill", "End");

        ArrayStack stack = new ArrayStack(5);
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.printStack();

        System.out.println("Peek Testing");
        System.out.println(stack.peek());

        System.out.println("PoP Testing");
        stack.pop();
        stack.printStack();
    }
}
