import java.util.*;
public class operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1");
        int num1=sc.nextInt();
        System.out.println("Enter number 2");
        int num2=sc.nextInt();
        System.out.println("Choose operator:\n 1 for + \n 2 for - \n 3 for * \n 4 for /");
        int operator=sc.nextInt();
        switch(operator){
            case 1:System.out.println(num1+num2);
            break;
            case 2:System.out.println(num1-num2);
            break;
            case 3:System.out.println(num1 *num2);
            break;
            case 4:System.out.println(num1 /num2);
            break;
            default :

            System.out.println("invalid input");

        }
    }
}
