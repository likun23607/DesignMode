package factory;

/**
 * Created by Administrator on 2016/11/21.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza=createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return  pizza;
    }

    abstract Pizza createPizza(String type);
}
