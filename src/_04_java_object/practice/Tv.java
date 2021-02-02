package _04_java_object.practice;

public class Tv {
    public static void main(String[] args) {
        MyTv newTv=new MyTv(12,50,true);
    }
}

class MyTv {
    int chanel;
    int volumeLevel;
    boolean on;

    MyTv() {
    }

    ;

    MyTv(int newChanel, int newVolumlevel, boolean newOn) {
        chanel = newChanel;
        volumeLevel = newVolumlevel;
        on = newOn;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChanel(int newChanel) {

    }

    public void setVolumeLevel(int newVolumlevel) {

    }

    public void chanelUp() {
        if (on && chanel > 1) {
            chanel++;
        }
    }

    public void chanelDown() {
        if (on && chanel < 120) {
            chanel--;
        }
    }

    public void volumUp() {
        if (on && volumeLevel > 120) {
            volumeLevel--;
        }
    }

    public void volumDown() {
        if (on && volumeLevel < 10) {
            volumeLevel++;
        }
    }
}
