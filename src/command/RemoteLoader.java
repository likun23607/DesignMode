package command;

/**
 * Created by Administrator on 2016/12/21.
 */
public class RemoteLoader {
    public static void main(String[] args) {
      //  RemoteControl remoteControl=new RemoteControl();
        RemoteControlWithUndo remoteControl=new RemoteControlWithUndo();

        Light livingRoomLight=new Light("卧室");
        Stereo stereo=new Stereo("客厅");
        CeilingFan ceilingFan=new CeilingFan("厨房");

        LightOnCommand livingRoomLightOnCommand=new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand=new LightOffCommand(livingRoomLight);

        StereoOnWithCDCommand stereoOnWithCDCommand=new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCDCommand=new StereoOffWithCDCommand(stereo);

        CeilingFanMediumCommand ceilingFanMediumCommand=new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand=new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand=new CeilingFanOffCommand(ceilingFan);

        Command[] partyOn={livingRoomLightOnCommand,stereoOnWithCDCommand,ceilingFanHighCommand};
        Command[] partyOff={livingRoomLightOffCommand,stereoOffWithCDCommand,ceilingFanOffCommand};
        MacroCommand partyOnMacro=new MacroCommand(partyOn);
        MacroCommand partyOffMacro=new MacroCommand(partyOff);


        remoteControl.setCommand(0,livingRoomLightOnCommand,livingRoomLightOffCommand);
        remoteControl.setCommand(1,stereoOnWithCDCommand,stereoOffWithCDCommand);

        remoteControl.setCommand(2,ceilingFanMediumCommand,ceilingFanOffCommand);
        remoteControl.setCommand(3,ceilingFanHighCommand,ceilingFanOffCommand);

        remoteControl.setCommand(4,partyOnMacro,partyOffMacro);




   /*     remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

         remoteControl.onButtonWasPushed(3);
         System.out.println(remoteControl);
         remoteControl.undoButtonWasPushed();

*/
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);

    }

}
