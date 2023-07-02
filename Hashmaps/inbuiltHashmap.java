package Hashmaps;

import java.util.HashMap;
import java.util.Set;

public class inbuiltHashmap{
    // create class
    public static void main(String[] args){     
        HashMap<String, Integer> map = new HashMap<>();
        
        // insert
        map.put("abc", 1);
        map.put("def", 2);
        map.put("xyz", 5);
        // update value instead of insertion if already present
        map.put("abc", 10);
        map.put("def", 20);
        System.out.println(map.size());

        // check if key exists
        if(map.containsKey("abc")){
            System.out.println("Present");
        }

        // check value - if present returns value else null
        int v = 0;
        if (map.containsKey("abc")){
            v = map.get("abc");
        }
        System.out.println(v);

        // remove
        int s = map.remove("abc");
        System.out.println(s);

        // check if value exists - expensive operation O(N) but operations on keys are O(1)
        if(map.containsValue(20)){
            System.out.println("Present");
        }

        // useful incase of frequency
        System.out.println(map.getOrDefault('a', null));

        // iteration
        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key + "  " + map.get(key));
        }
    } 
}
