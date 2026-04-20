package src.com.gla.Generic_Problem_Statements;
import java.util.*;
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
public class AnimalHierarchy {
    static void printAnimals(List<? extends Animal> a){
        System.out.println(a.size());
    }
}