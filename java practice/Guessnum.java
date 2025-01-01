import java.util.*;
public class Guessnum {
    
    public static void main(String[] args) {
        int num=17;
        int userInput;
        Scanner sc = new Scanner (System.in);
        System.out.println("guess number");
       
        do {
             userInput= sc.nextInt();

            if (num != userInput) {
                System.out.println("Incorrect! Try again.");
            }
        }while (num!=userInput);
            System.out.println("you win");
        }
    }

