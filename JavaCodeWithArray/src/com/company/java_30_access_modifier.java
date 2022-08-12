package com.company;

class AM1{
    public int x =10;
    private int y  =20;
    protected int z = 30;
    int a = 40; // no modifier

    // we can you all access modifier in same class
    public void method(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

class AM2 extends AM1{
    AM2(){
        System.out.println("I am AM2 ");
    }
}

public class java_30_access_modifier {
    public static void main(String[] args) {
        AM1 am = new AM1();

       // am.method();

//        System.out.println(am.x);
//        // System.out.println(am.y); //it is a private access modifier, so we can not use in packages
//        System.out.println(am.z);
//        System.out.println(am.a);

        AM2 am2 = new AM2();
        System.out.println(am2.x);
//        System.out.println(am2.y);
    }
}
