import java.util.*;
public class Conditional {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("enter your age");
         int age = sc.nextInt();
         if (age >= 18) // yaha ; ye ni lgta wrna yaha p ye terminate ho jyega
         {
             System.out.println("eligible");        
         }else{
             System.out.println("not eligible");
         }
        
}
 
}
 // if (condition){
//     block of code
// }else{
//     block of code
// }



// if (condition){
//     block of code
// }else if (condition){
//     block of code
// }else{
//     block of code
// }


// switch (expression) {
//     case value1:
//         block of code
//         break;
//     case value2:
//         block of code
//         break;
//     default:
//         block of code
// }