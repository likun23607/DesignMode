package decorator;

/**
 * Created by Administrator on 2016/11/18.
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }

    @Override
    public double cost() {
        return .10+beverage.cost();
    }
}
