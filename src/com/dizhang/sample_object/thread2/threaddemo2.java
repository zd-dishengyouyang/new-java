package com.dizhang.sample_object.thread2;

public class threaddemo2 {
    public static void main(String[] args) {
        mythread my=new mythread();
        Thread thread1=new Thread(my);
        Thread thread2=new Thread(my);
        thread1.setName("demo1");
        thread2.setName("demo2");
        thread1.start();
        thread2.start();
    }
}
