package single;

/**
 * Created by Administrator on 2016/11/30.
 */
public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance= new Singleton();
        }
        return uniqueInstance;
    }
}
