package command;

/**
 * Created by Administrator on 2016/12/21.
 */
public class Light {
    String name;
    public Light(String name){
        System.out.println(name+"selected");
        this.name=name;
    }

    public void on(){
        System.out.println(name+"light on!");
    }
    public void off(){
        System.out.println(name+"light off!");
    }
}
