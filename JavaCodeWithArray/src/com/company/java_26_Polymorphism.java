package com.company;

interface Camera2{
    void takeSnap();
    private void slowMotion(){
        System.out.println("Slow Motion mode on~");
    }
    default void default_things(){
        slowMotion();
    }
    void takeVideo();
}
interface Media {
    void checkAlbum();
    void checkCallLogs();
}
class MySmartPhoneVivo implements Media,Camera2{
    @Override
    public void takeSnap(){
        System.out.println("Taking snap...");
    }
    @Override
    public void takeVideo(){
        System.out.println("Taking Video....");
    }
    @Override
    public void checkAlbum(){
        System.out.println("Checking photos and videos....");
    }
    @Override
    public void checkCallLogs(){
        System.out.println("Checking call logs....");
    }
}

public class java_26_Polymorphism {
public static void main(String [] args){

   // reference       //object
    Camera2 cam = new MySmartPhoneVivo(); // only allows the camera methods
    cam.takeVideo();
    cam.takeSnap();
    cam.default_things();

    // cam.checkAlbum(); this is not allowed

    Media me  = new MySmartPhoneVivo();// only allows the Media methods
    me.checkAlbum();
    me.checkCallLogs();

}
}
