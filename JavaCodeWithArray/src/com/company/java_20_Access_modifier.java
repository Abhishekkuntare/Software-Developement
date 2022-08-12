package com.company;

class circle{
    private float rad;

    public void setArea(float new_rad){
        this.rad = new_rad;
    }
    public float getArea(){
        return 3.14f*(rad*rad);
    }
    public float getPerimeter(){
        return 2*3.14f*rad;
    }

}

class me_employee{
    //private is a access modifier
   private int id;
   private String name;

   public void setId(int new_id){
       this.id = new_id;
   }

   public int getId(){
       return id;
   }

   public void setName(String new_name){
       name= new_name;
   }

   public String getName(){
       return name;
   }
}

public class java_20_Access_modifier {
    public static void main(String[] args) {
    me_employee abhi = new me_employee();
    abhi.setId(2);
    abhi.setName("Abhishek");
    System.out.println(abhi.getId());
    System.out.println(abhi.getName());


   // class circle
        circle ci = new circle();
        ci.setArea(3);
       // ci.rad; //// can't do that , 'rad' has private access in 'com.company.circle'
        System.out.println(ci.getArea());
        System.out.println(ci.getPerimeter());


    }
}
