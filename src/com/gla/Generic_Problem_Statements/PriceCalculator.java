package src.com.gla.Generic_Problem_Statements;
import java.util.*;
class Product{
    double price;
    Product(double p){ price=p; }
    double getPrice(){ return price; }
}
public class PriceCalculator {
    static double calculateTotal(List<? extends Product> list){
        double sum=0;
        for(Product p:list) sum+=p.getPrice();
        return sum;
    }
}