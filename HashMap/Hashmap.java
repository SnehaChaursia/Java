import java.util.HashMap;
import java.util.Map;
public class Hashmap {
    public static void main(String[] args) {
HashMap <String,Integer> map = new HashMap<>();
        map.put("Sneha",18);
        map.put("Pratham",10);
        System.out.println(map);
       int age= map.get("Sneha");
       System.out.println(age);
       if (map.containsKey("Pratham")){
        System.out.println("Hi pratham");
       }
       if (map.containsValue(18)){
        System.out.println("Sneha is 18");
    }
    map.remove("Sneha");
    System.out.println(map);

    for (String Key:map.keySet()){
      System.out.println("Key:"+ Key);
    }
    for (int value : map.values()) {
        System.out.println("Value: " + value);
    }
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
}

    }
}
