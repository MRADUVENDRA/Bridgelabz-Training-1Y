package src.com.gla.Map_Interface;
import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Map<String,Double> map=new HashMap<>();
        map.put("101",5000.0);
        map.put("102",7000.0);
        map.put("101",map.get("101")+1000);
        System.out.println(map);
    }
}
