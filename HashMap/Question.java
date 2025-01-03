// Find the first non-repeating character in a string using HashMap.
import java.util.HashMap;
public class Question {
    public static char findNonRepeating(String str){
    HashMap<Character,Integer> map= new HashMap<>();
    for (char ch:str.toCharArray()){
        map.put(ch,map.getOrDefault(ch, 0)+1);
    }
    for (char ch :str.toCharArray()){
        if (map.get(ch)==1){
            return ch;
        }
    }
    return '\0'; 
}
 public static void main ( String []args){
    String str= "swwiiss";
    char result= findNonRepeating(str);
    if (result!='\0'){
        System.out.println(result);
    }
    else{
        System.out.println("not found");
    }
 }
    }