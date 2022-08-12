package com.company;

interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Night!");
    }
    default void record4kVideos(){
        greet();
        System.out.println("4K Videos");
    }
}

interface Wifi{
    String[] GetNetworks();
    void connectToNetworks(String Network);
}

interface Accessrieos{
    String[] getAccessrieos();
}

class MyCellPhone{
    public void callNumber(int number){
        System.out.println("Calling.... "+number  );
    }
    public void pickCall(int number){
        System.out.println("Connections.... "+ number);
    }
}

class MySmartPhone extends MyCellPhone implements Camera,Wifi,Accessrieos{

    @Override
    public void takeSnap(){
        System.out.println("Taking snap");
    }

    @Override
    public void recordVideo(){
        System.out.println("");
    }

    @Override
    public String[]GetNetworks(){
        System.out.println("Getting list of networks");
        String [] networkList = {"Abhishek","Harry","Aniket.5G"};
        return networkList;
    }

    @Override
    public void connectToNetworks(String network){
        System.out.println("Connecting to "+ network);
    }

    @Override
    public String[] getAccessrieos(){
        System.out.println("Accessrieos: ");
        String[] MyAccessrieos = {"Charger","3-Covers","EarBurds"};
        return MyAccessrieos;
    }
}

public class java_24_InterfaceExampleAndDefaultMethod {
    public static void main(String[]args){

        MySmartPhone msp = new MySmartPhone();
        String[] arr =  msp.GetNetworks();

       for(String item: arr){
           System.out.println(item);
       }

      /* msp.pickCall(22222);
       msp.callNumber(42);*/

//     String[] access=msp.getAccessrieos();
//     for(String item:access){
//         System.out.println(item);
//     }
        // msp.greet(); throws an errors
        msp.record4kVideos();
    }
}
