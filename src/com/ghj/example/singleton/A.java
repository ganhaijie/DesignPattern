package com.ghj.example.singleton;

/**
 * 饿汉模式
 */
public class A {

    private static A instance = new A();

    private A(){

    }

    public static A getInstance(){
        return instance;
    }
}

//Y 类加载的时候完成实例化 避免了线程的同步问题
//N 无法达到懒加载的效果 没有用到这个实例  造成内存浪费 可忽略