package LeetcodeAssignment;
// Write a method that returns the factorial of a 
// given number using a while loop.

public class factorial {
    public static void main(String[] args) {
        int i=1;
        int n=5;
        int factorial=1;
        while (i<=n){
           factorial*=i;
           i++;
        }
        System.out.println(factorial);
    }
    
}
