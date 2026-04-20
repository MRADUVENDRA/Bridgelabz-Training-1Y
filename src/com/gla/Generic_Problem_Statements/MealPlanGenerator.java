package src.com.gla.Generic_Problem_Statements;
interface MealPlan{}
class Veg implements MealPlan{}
class Meal<T extends MealPlan>{}
public class MealPlanGenerator {
    static <T extends MealPlan> void generate(T m){
        System.out.println("Meal generated");
    }
}