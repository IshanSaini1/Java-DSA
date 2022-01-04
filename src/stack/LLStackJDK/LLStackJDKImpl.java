package stack.LLStackJDK;

import stack.Employee;

public class LLStackJDKImpl {
    public static void main(String args[]) {

        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(567, "John", "Doe");
        Employee marySmith = new Employee(890, "Mary", "Smith");
        Employee mikeWilson = new Employee(112, "Mike", "Wilson");
        Employee billEnd = new Employee(114, "Bill", "End");

        LLStackMain stack = new LLStackMain();
        stack.push(janeJones);
        stack.push(marySmith);
        stack.printStack();

        // Peeking the first element
        System.out.println("Peeking the first Element");
        System.out.println(stack.peek());
        //Poping Element
        System.out.println("Poping an element from the stack");
        stack.pop();
        stack.printStack();

    }
}
