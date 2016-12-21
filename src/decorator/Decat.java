package decorator;

/**
 * Created by Administrator on 2016/11/18.
 */
public class Decat extends Beverage{
    public Decat(){
        description="Decat";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
