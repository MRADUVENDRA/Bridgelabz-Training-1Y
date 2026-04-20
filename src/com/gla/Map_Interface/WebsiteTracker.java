package src.com.gla.Map_Interface;
import java.util.*;

public class WebsiteTracker {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        String[] pages={"home","about","home","contact","home"};
        for(String p:pages){
            map.put(p,map.getOrDefault(p,0)+1);
        }
        System.out.println(map);
    }
}
