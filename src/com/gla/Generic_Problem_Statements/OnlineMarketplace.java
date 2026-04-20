package src.com.gla.Generic_Problem_Statements;
class ProductCategory{}
class Product<T extends ProductCategory>{}
public class OnlineMarketplace {
    static <T extends Product<?>> void applyDiscount(T p,double per){
        System.out.println("Discount applied");
    }
}