package hashtables.BasicStructure;

import hashtables.Employee;

public class SimpleArrayHashMap {

    private Employee[] hashtable;

    public SimpleArrayHashMap() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee value) {
        int hashedKey = hashCode(key);
        if (hashtable[hashedKey] != null) {
            System.out.println("HashTable Position not available @ " + hashedKey + " Employee is at that place" + hashtable[hashedKey]);
        } else {
            hashtable[hashedKey] = value;
        }
    }

    public Employee get(String key) {
        int hashedKey = hashCode(key);
        return hashtable[hashedKey];
    }

    private int hashCode(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashTable(){
        for (int i=0;i<hashtable.length;i++){
            System.out.println(hashtable[i]);
        }
    }

}
