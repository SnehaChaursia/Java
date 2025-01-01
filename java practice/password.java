// Implement a program that uses a do-while loop to prompt the user until they input a valid password.
import java.util.*;
public class password {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String userInput="";
    String password="password";
    do {
        System.out.println("enter correct password");
        userInput=  sc.nextLine();

    }while(!userInput.equals(password));
    System.out.println("correct password");
}
}