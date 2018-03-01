package com.ghj.thread.await;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(5);

        for (int i=0;i<5;i++){
            Thread childThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("子线程执行"+Thread.currentThread().getName());
                    latch.countDown(); //让latch数值-1
                }


            });

            childThread.start();
        }

        latch.await();
        System.out.println("主线程执行完成");
    }


}
