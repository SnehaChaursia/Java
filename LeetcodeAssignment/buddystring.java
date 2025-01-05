package LeetcodeAssignment;
import java.util.ArrayList;
public class buddystring {

    public static boolean buddystring(String s, String goal) {
if (s.length()!=goal.length())
return false;
if (s.equals(goal)){
    int []count=new int [26];
    for (char c:s.toCharArray()){
        count[c-'a']++;
        if (count[c-'a']>1)
    
        return true;
    }
}
    ArrayList<Integer> diff=new ArrayList<>();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=goal.charAt(i)){
            diff.add(i);
        }
    }

return diff.size()==2 && s.charAt(diff.get(0))==goal.charAt(diff.get(1))&&
s.charAt(diff.get(1))==goal.charAt(diff.get(0));
}
public static void main(String[] args) {
    String s="ab";
    String goal="ba";
    System.out.println(buddystring(s,goal));
}
    
}
