package LeetcodeAssignment;
import java.util.*;
public class Printodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
        sc.close(); 
    }
    
}
