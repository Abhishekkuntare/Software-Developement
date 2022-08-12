package com.company;
import java.lang.*;

class MyCircle{
    public int radius;
    MyCircle(){
        System.out.println("I am non-parametrised constructor"); // this will call
        // only when we remove the super in Cylinder class
    }

    //parameterised constructor
    MyCircle(int r){
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class MyCylinder extends MyCircle{
    public int height;
    MyCylinder(int h){
        this.height= h;
    }
    MyCylinder(int r, int h){
        super(r); // call the MyCircle class parameterised constructor
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
    public double CylinderRadius(){
        return 2*Math.PI*radius*height+2*Math.PI*radius*2;
    }

}

class Cuboid extends MyCylinder{
    private int length;
   private int width;
    Cuboid(int l,int w,int h){
        super(h);
        this.length = l;
        this.width = w;
    }
    public void setLength(int length){
        this.length= length;
    }
    public void setWidth(int width){
        this.width  =width;
    }
    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }
}


public class java_17_newPracIinheritance {
    public static void main(String args[]){
        //MyCircle ci = new MyCircle(4);;
        MyCylinder mc = new MyCylinder(1,2);

        System.out.println(mc.CylinderRadius());
        System.out.println(mc.volume());

        Cuboid cu =new Cuboid(3,14,5);

        cu.setLength(3);
        cu.setWidth(4);
        System.out.println("Length: "+cu.getLength());
        System.out.println("Width: "+cu.getWidth());

    }
}
