package src.com.gla.Map_Interface;
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String,Double> cart=new LinkedHashMap<>();
        cart.put("Mobile",3000.0);
        cart.put("Laptop",6000.0);
        double total=0;
        for(double p:cart.values()) total+=p;
        System.out.println("Total: "+total);
    }
}
