package src.com.gla.Generic_Problem_Statements;
public class MaximumOfThree {
    static <T extends Comparable<T>> T maximum(T x,T y,T z){
        T max=x;
        if(y.compareTo(max)>0) max=y;
        if(z.compareTo(max)>0) max=z;
        return max;
    }
}