package factory;

/**
 * Created by Administrator on 2016/11/21.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore=new NYPizzaStore();

        Pizza pizza=nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());

    }
}
