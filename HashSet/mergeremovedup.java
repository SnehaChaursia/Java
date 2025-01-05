package HashSet;
import java.util.*;
import java.util.HashSet;
public class mergeremovedup {
    
    public static int[] merge(int arr1[],int arr2[]){
     HashSet <Integer> uniqueElement = new HashSet<>();  // using HashSet as it stors unique value
     for (int num : arr1){
        uniqueElement.add(num);
     }
     for (int num : arr2){
        uniqueElement.add(num);
     }
     int[] mergedArray= new int [uniqueElement.size()];   // restoring unique value to an array:mergedArray
     int index=0; 
     for (int num:uniqueElement){
        mergedArray[index]=num;  
        index++;  
        
     }
     return mergedArray;

    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int [] arr2={2,3,4,5};
        System.out.println(Arrays.toString(merge(arr1, arr2)));

        
    }
}
