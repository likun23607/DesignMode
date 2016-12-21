package command;

/**
 * Created by Administrator on 2016/12/21.
 */
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
