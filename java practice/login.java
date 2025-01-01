import java.util.*;
public class login {
   public static void main(String[] args) {
      String password="pratham1811#";
      Scanner sc= new Scanner(System.in);
      System.out.println("enter password");
      String userpassword=sc.nextLine();
      if (userpassword.equals(password)){
        System.out.println("accsess");
      }
      else {
        System.out.println("wrongpassword");
      }
    
   } 
}
