package com.dizhang.sample_object.thread2;

public class mythread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"good afternoon！");
        }
    }
}
