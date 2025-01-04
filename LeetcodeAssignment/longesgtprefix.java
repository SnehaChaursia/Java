package LeetcodeAssignment;

import java.util.Arrays;

public class longesgtprefix {
    public static String result(String []str){
         StringBuilder result=new StringBuilder ();
         Arrays.sort(str);
         char[]first=str[0].toCharArray();
         char[]laast=str[str.length-1].toCharArray();
         for(int i=0;i<first.length;i++){
             if(first[i]!=laast[i]){
                break;
         }
             result.append(first[i]);
         }
         return result.toString();
    }
    public static void main(String[] args) {
        String []str={"flower","flow","flight"};
        System.out.println(result(str));
    }
}
