package src.com.gla.Generic_Problem_Statements;
class Fruit{}
class Apple extends Fruit{}
class Mango extends Fruit{}
class FruitBox<T extends Fruit>{
    void add(T f){ System.out.println("Added"); }
}
public class FruitStorage {
    public static void main(String[] args) {
        FruitBox<Apple> box=new FruitBox<>();
        box.add(new Apple());
    }
}