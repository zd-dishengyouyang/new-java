package com.dizhang.sample_object.thread;

public class threadDemo {
    public static void main(String[] args) {

        mythread demo1=new mythread();
        mythread demo2=new mythread();
        demo1.setName("demo1");
        demo2.setName("demo2");
        demo1.start();
        demo2.start();
    }
}
