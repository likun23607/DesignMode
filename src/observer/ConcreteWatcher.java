package observer;

/**
 * Created by Administrator on 2016/11/10.
 */
public class ConcreteWatcher implements Watcher{
    @Override
    public void update(String str)
    {
        System.out.println(str);
    }
}
