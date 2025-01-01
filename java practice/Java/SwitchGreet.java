import java.util.*;
public class SwitchGreet {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the Button");
        int Button= sc.nextInt();
switch (Button)
{
    case 1: System.out.println("Hello"); break;
    case 2: System.out.println("Namaste"); break;
    case 3: System.out.println("Guten tag"); break;
    default: System.out.println("Invalid Button");
}
    }
    }
   

