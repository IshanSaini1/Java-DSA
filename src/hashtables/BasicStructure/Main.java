package hashtables.BasicStructure;

import hashtables.Employee;

public class Main {
    public static void main(String args[]){
        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(567, "John", "Doe");
        Employee marySmith = new Employee(890, "Mary", "Smith");
        Employee mikeWilson = new Employee(112, "Mike", "Wilson");
        Employee billEnd = new Employee(114, "Bill", "End");

        SimpleArrayHashMap hashMap = new SimpleArrayHashMap();
        hashMap.put("Jones",janeJones);
        hashMap.put("Doe",johnDoe);
        hashMap.put("Wilson",mikeWilson);
        hashMap.put("Smith",marySmith);

        System.out.println(hashMap.get("Doe"));
        //hashMap.printHashTable();


    }
}
