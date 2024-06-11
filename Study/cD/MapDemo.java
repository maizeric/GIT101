package collectionDemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

//Map can be implemented by HashMap or Hashtable
public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //It is implemented by hashmap so values can get scattered
        map.put("myName", "Srikanth");
        map.put("myAge", "26");
        map.put("works","IT");
        Set<String> set = map.keySet();//We can store the keys in seperate set nand we can iterate over
        map.forEach((map1,map2)-> System.out.println(map1+" "+map2));

        //The same can be done using HashTable
        System.out.println("map using hashtable");
        Map<String, String> map1 = new Hashtable<>();
        map1.put("myName", "Srikanth");
        map1.put("myAge", "26");
        map1.put("works","IT");

        map1.forEach((map3,map2)-> System.out.println(map3+" "+ map2));

        //Differences
        //HashMap and hashtable uses hashing
        //Hashmap is not synncronized hence not thread safe hence fast
        //hashtable is synchronize hence thread safe hence slow
        //hashmap allows only one null key and hashtable does not allow null key
        //In both the above the order is not maintained
        //if you want to maintain the order then linkedhashmap
        //if you want the elements in sorted order thne treehashmap
    }
}
