package command;

/**
 * Created by Administrator on 2016/12/21.
 */
public interface Command {
    public void execute();
    public void undo();
}
