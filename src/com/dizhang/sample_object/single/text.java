package com.dizhang.sample_object.single;

public class text {
    public static void main(String[] args) {
        demo2 ehan1=demo2.instance;
        demo2 ehan2=demo2.instance;
        System.out.println(ehan1==ehan2);
        demo1 lanhan=demo1.getInstance();
        demo1 lanhan2=demo1.getInstance();
        System.out.println(lanhan==lanhan2);
    }
}
