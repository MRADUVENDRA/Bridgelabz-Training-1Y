package src.com.gla.Map_Interface;
import java.util.*;

public class SentenceWordCount {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);

        for(String key: map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
