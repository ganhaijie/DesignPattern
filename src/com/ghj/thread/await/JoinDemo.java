package com.ghj.thread.await;

import java.util.Vector;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        Vector<Thread> threadVector = new Vector<Thread>();
        for (int i=0 ;i<5;i++){
            Thread childThread  =new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("子线程执行："+Thread.currentThread().getName());
                }
            });
            threadVector.add(childThread);
            childThread.start();
        }


        for (Thread thread : threadVector){
            thread.join();
        }

        System.out.println("主线程执行完毕");
    }
}
