package com.ghj.example.singleton;

/**
 * 内部类
 */
public class C {
    private C() {

    }

    private static class SinglelonHolder {
        private static C instance = new C();
    }

    public static C getInstance() {
        return SinglelonHolder.instance;
    }

}

//类的静态属性只会在第一次加载类的时候初始化