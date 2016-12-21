package factory;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/21.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

     abstract void prepare();
     void bake(){
         System.out.println("Bake for 25 minutes at 350");
     }
     void cut(){
         System.out.println("Cutting the pizza into diagonal slices");
     }
    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
