package decorator;

/**
 * Created by Administrator on 2016/11/18.
 */
public class HouseBlend extends Beverage{
    public HouseBlend(){
        description="House Blend Coffe";
    }
    @Override
    public double cost() {
        return .89;
    }
}
