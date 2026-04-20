package src.com.gla.Generic_Problem_Statements;
import java.util.*;
abstract class WarehouseItem{}
class Electronics extends WarehouseItem{}
class Groceries extends WarehouseItem{}
class Storage<T extends WarehouseItem>{
    List<T> list=new ArrayList<>();
    void add(T item){ list.add(item); }
    void show(){ System.out.println(list.size()); }
}
public class WarehouseSystem {
    public static void main(String[] args) {
        Storage<Electronics> s=new Storage<>();
        s.add(new Electronics());
        s.show();
    }
}