package src.com.gla.Generic_Problem_Statements;
import java.util.*;
class Cart<T>{
    List<T> items=new ArrayList<>();
    void addItem(T i){ items.add(i); }
    void removeItem(T i){ items.remove(i); }
    void displayItems(){ System.out.println(items); }
}
public class GenericCart {
    public static void main(String[] args) {
        Cart<String> c=new Cart<>();
        c.addItem("Mobile");
        c.displayItems();
    }
}