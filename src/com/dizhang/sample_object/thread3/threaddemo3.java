package com.dizhang.sample_object.thread3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class threaddemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc =new MyCallable();
        FutureTask<Integer> ft=new FutureTask<>(mc);
        Thread t1=new Thread(ft);
        t1.start();

        Integer result = ft.get();
        System.out.println(result);
    }
}
