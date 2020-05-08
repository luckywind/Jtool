package com.rambo.tools.executor;

import java.util.LinkedList;
import java.util.concurrent.*;

/**
 * Copyright (c) 2015 XiaoMi Inc. All Rights Reserved.
 * Authors: chengxingfu <chengxingfu@xiaomi.com>
 * Date:2020-05-08
 */
public class MyExecutors {
    public static void main(String[] args) {
//        usingSingle();
        usingCachedThreadPool();
        

    }
    public static void usingCachedThreadPool() {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        LinkedList<Future<String>> results = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            Future<String> res = cachedThreadPool.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return Thread.currentThread().getName();
                }
            });
            results.add(res);
        }
        for (int i = 0; i < results.size(); i++) {
            Future<String> stringFuture = results.get(i);
            System.out.println(stringFuture);

        }
        cachedThreadPool.shutdown();
        try {
            cachedThreadPool.awaitTermination(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public static void usingSingle() {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        singleThreadExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("task 1");
            }
        });
        singleThreadExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("task 2");
            }
        });

        singleThreadExecutor.shutdown();
        try {
            singleThreadExecutor.awaitTermination(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
