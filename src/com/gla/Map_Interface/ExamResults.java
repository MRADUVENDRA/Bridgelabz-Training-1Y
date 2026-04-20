package src.com.gla.Map_Interface;
import java.util.*;

public class ExamResults {
    public static void main(String[] args) {
        Map<String,Map<String,Integer>> map=new HashMap<>();
        Map<String,Integer> math=new HashMap<>();
        math.put("A",90);
        map.put("Math",math);
        System.out.println(map);
    }
}
