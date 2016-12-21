package factory;

/**
 * Created by Administrator on 2016/11/21.
 */
public class NYPizzaStore extends  PizzaStore{
    @Override
    Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(item.equals("veggie")){

        }else if(item.equals("clam")){

        }else if(item.equals("pepperoni")){

        }
            return null;


    }
}
