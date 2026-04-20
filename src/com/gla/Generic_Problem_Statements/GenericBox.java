package src.com.gla.Generic_Problem_Statements;
class Box<T> {
    T value;
    void set(T v) { value=v; }
    T get() { return value; }
}
public class GenericBox {
    public static void main(String[] args) {
        Box<Integer> b=new Box<>();
        b.set(10);
        System.out.println(b.get());
    }
}