package stack.LLStackJDK;

import stack.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class LLStackMain {
    private LinkedList<Employee> stack;

    public LLStackMain(){
        stack = new LinkedList<>();
    }

    public void push(Employee employee){
        stack.push(employee);
    }

    public Employee pop(){
        return stack.pop();
    }

    public Employee peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int getSize(){
        return stack.size();
    }

    public void printStack(){
        Iterator iter = stack.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
