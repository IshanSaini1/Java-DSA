package others;

public class RecursionBasics {
    public static int recursiveFactorial(int num){
        if(num == 0){
            return 1;
        }
        return num * recursiveFactorial(num-1);
    }
    public static void main(String args[]){
    System.out.println(recursiveFactorial(4));
    }
}
