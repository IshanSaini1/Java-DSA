package arrays;

public class BasicArrays {

    public static void main(String args[]){
        Long longArray[] = new Long[10];
        Integer intArray[] = new Integer[]{1,2,3,4,5} ;

        // Print integer Array :
        for(int i = 0;i<intArray.length; i++){
            System.out.println("Array Item @ "+(i+1)+" is "+intArray[i]);
        }
    }
}
