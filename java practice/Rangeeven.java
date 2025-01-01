import java.util.*;
public class Rangeeven {
   public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
       int lowerBound=10;
       int upperBound=50;
       System.out.println("Enter a number");
       int number = sc.nextInt();
       if (number>=lowerBound && number<=upperBound && number%2==0){
        System.out.println("within range");

       } else {
        System.out.println("out of range");
       }
   } 
}
