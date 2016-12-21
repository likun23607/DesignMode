package command;

/**
 * Created by Administrator on 2016/12/21.
 */
public class Stereo {
    String name;

    public Stereo(String name){
        System.out.println(name+" selected");
        this.name=name;
    }

    public void on(){
        System.out.println(name+" Stereo on");
    }
    public void off(){
        System.out.println(name+" Stereo off");
    }

    public void setCd(){
        System.out.println(name+" CD is set");
    }

    public void setDvd(){
        System.out.println(name+" DVD is set");
    }

    public void setRadio(){
        System.out.println(name+" Radio is set");
    }
    public void setVolume(int volume){
        System.out.println(name+" volume is set="+volume);
    }
}
