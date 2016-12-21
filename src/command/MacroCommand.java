package command;

/**
 * Created by Administrator on 2016/12/21.
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands=commands;
    }

    @Override
    public void execute() {
        for(int i=0;i<commands.length;i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {

    }
}
