import java.util.*;
public class Table {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
        int Table = 0;
       
        for (int i=1;i<=10;i++) {
        Table=n*i;
        System.out.println(" " + n + " * " + i + " = " + Table);
    }   
    }
}

