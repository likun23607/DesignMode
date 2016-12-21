package command;

/**
 * Created by Administrator on 2016/12/21.
 */
public class StereoOffWithCDCommand implements Command{
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo){
        this.stereo=stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
