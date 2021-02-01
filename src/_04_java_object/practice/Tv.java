package _04_java_object.practice;

public class Tv {
}
class MyTv{
    int chanel;
    int volumeLevel;
    boolean on;
    MyTv(){};
    MyTv(int newChanel,int newVolumlevel,boolean newOn){
        chanel=newChanel;
        volumeLevel=newVolumlevel;
        on=newOn;
    }
    public void turnOn(){
        on=true;
    }
    public void turnOff(){
        on=false;
    }
    public void setChanel(int newChanel){

    }
     public void setVolumeLevel(int newVolumlevel){

    }
    public void chanelUp(){

    }
    public void chanelDown(){

    }
    public void volumUp(){

    }
    public void volumDown(){

    }

}
