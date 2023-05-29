package com.dizhang.sample_object.thread;

public class mythread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"good morning!");
        }


    }
}
