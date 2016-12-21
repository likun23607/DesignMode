package command;

/**
 * Created by Administrator on 2016/12/21.
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
