
 import java.util.*;
 
 public class OddEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in); //(null)
    System.out.println("Enter the number");
    int n = sc.nextInt();
    if(n%2==0){
      System.out.println("The number is even");
    }
    else{
      System.out.println("The number is odd");
    }
  }  
}
