package decorator;

/**
 * Created by Administrator on 2016/11/18.
 */
public class DarkRoast extends Beverage{
    public DarkRoast(){
        description="DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
