package src.com.gla.Generic_Problem_Statements;
import java.util.*;
public class NumericSum {
    static double sumNumbers(List<? extends Number> list){
        double sum=0;
        for(Number n:list) sum+=n.doubleValue();
        return sum;
    }
}