package decorator;

/**
 * Created by Administrator on 2016/11/18.
 */
public abstract class Beverage {
    String description="Unknown Beverage";

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
