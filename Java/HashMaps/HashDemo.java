import java.util.HashMap;
import java.util.HashSet;

public class HashDemo {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        HashMap<String,String>map2=new HashMap<>();
        map.put("steve", 21);
        map.put("tony", 31);
        map.put("peater", 11);
        map.put("frank", 23);
        map2.put("apple", "newton");
        System.out.println(map.get("tony"));
        System.out.println(map.get("apple"));
        HashSet<Integer>set=new HashSet<>();
        set.add(3);
        set.add(32);
        set.add(3222);
        set.add(31);
        System.out.println(set);
        System.out.println(set.contains(3));
    }
}
