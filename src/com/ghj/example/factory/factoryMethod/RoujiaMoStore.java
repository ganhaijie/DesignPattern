package com.ghj.example.factory.factoryMethod;

import com.ghj.example.factory.RoujiaMo;

/**
 * 工厂方法模式
 *
 * 定义一个创建对象的接口 由子类决定要实例化得类是哪一个 工厂方法模式把实例化得过程推迟到子类
 */
public abstract class RoujiaMoStore {

    public abstract RoujiaMo createRouJiaMo(String type);

    /**
     * 根据传入类型卖不同的肉夹馍
     *
     * @param type
     * @return
     */
    public RoujiaMo sellRouJiaMo(String type)
    {
        RoujiaMo rouJiaMo = createRouJiaMo(type);
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }
}
