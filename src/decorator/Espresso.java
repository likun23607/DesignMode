package decorator;

/**
 * Created by Administrator on 2016/11/18.
 */
public class Espresso extends Beverage{

    public Espresso(){
        description="Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
