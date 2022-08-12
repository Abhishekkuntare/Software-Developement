package com.company;

class Rect{
    private int len;
    private int hei;

//    default constructor
    public Rect(){
        this.len=0;
        this.hei = 0;
    }
    public Rect(int len,int hei){
        this.len = len;
        this.hei = hei;
    }
    public int getLen(){
        return len;
    }
    public int getHei(){
        return hei;
    }
}

class Cylinder{
//    properties
private int radius;
private int height;

public Cylinder(int rad,int hei){
    radius = rad;
    height = hei;
}

// shortcut (Alt+ insert)
    public void setRadius(int radius) {
        this.radius = radius;
    }


    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
    public double volume(){
    return Math.PI * radius * radius *height;
    }
    public double sufaceArea(){
    return 2*Math.PI * radius * height + 2*Math.PI * radius * radius;
    }

}
public class java_14_practiseset_constructor {
    public static void main(String[] args) {
        //problem 1;
        /*
        Cylinder cy = new Cylinder();
        cy.setHeight(10);
        cy.setRadius(20);
        System.out.println(cy.getHeight());
        int radius = cy.getRadius();
        System.out.println(radius);*/

//        using constructor
        Cylinder cy  = new Cylinder(10,3);
        System.out.println(cy.volume());
        System.out.println(cy.sufaceArea());

          Rect rec = new Rect();
        // Rect rec = new Rect(1,2);
        System.out.println(rec.getHei());
        System.out.println(rec.getLen());
    }
}
