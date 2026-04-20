package src.com.gla.Generic_Problem_Statements;
import java.util.*;
public class CopyList {
    static void copyList(List<? super Number> d,List<? extends Number> s){
        d.addAll(s);
    }
}