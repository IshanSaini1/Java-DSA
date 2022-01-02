package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {
    public static void main(String args[]) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(10, "Ishan", "Saini"));
        empList.add(new Employee(11, "John", "Doe"));
        empList.add(new Employee(12, "Jane", "Doe"));
        empList.add(new Employee(13, "William", "Smith"));

        //Print all the employees
        empList.stream().forEach(x->System.out.println(x.toString()));

        System.out.println();
        System.out.println("Print Employee at Index 2");
        System.out.println(empList.get(1));

        System.out.println();
        System.out.println("Check If the list is Empty");
        System.out.println(empList.isEmpty());

        System.out.println();
        System.out.println("Replace the Employee at a particular Index");
        empList.set(1, new Employee(14,"Kane","McFly"));
        System.out.println(empList.get(1));

        System.out.println();
        System.out.println("Check Size of the List");
        System.out.println(empList.size());

        System.out.println();
        System.out.println("Addition of another Employee at particular Index");
        empList.add(3,new Employee(15,"Theo","Last"));
        empList.forEach(x->System.out.println(x));

        // Get the Array from list
        System.out.println();
        System.out.println("Get Array from List");
        Employee[] empArray = empList.toArray(new Employee[empList.size()]);
        Arrays.stream(empArray).forEach(x->System.out.println(x));

        System.out.println();
        System.out.println("Check if Item is Present in List");
        System.out.println(empList.contains(new Employee(15,"Theo","Last")));

        System.out.println();
        System.out.println("Remove Item from List");
        empList.remove(new Employee(15,"Theo","Last"));
        System.out.println("Object Removed");

    }
}
