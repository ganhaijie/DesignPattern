package com.ghj.example.singleton;

/**
 * 懒汉 线程不安全
 */
public class B {

    private static B instance = null;

    private B() {

    }

    public static B getInstance() {
        if (instance == null) {
            instance = new B();
        }
        return instance;
    }


 /*
  线程安全的写法 加入synchronized关键字
  public static synchronized  B getInstance() {
        if (instance == null) {
            instance = new B();
        }
        return instance;
    }*/


/*
双重校验锁 保证了延迟加载和线程安全
public static B getInstance(){
     if(instance == null){
         synchronized (B.class){
             if(instance == null){
                 instance = new B();
             }

         }
     }
     return instance;
 }*/

}
