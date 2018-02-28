package com.ghj.example.factory.abstractFactory;

public class XianRouJiaMoYLFactroy implements RouJiaMoYLFactroy {
    @Override
    public Meat createMeat() {
        return new FreshMeat();
    }

    @Override
    public YuanLiao createYuanliao() {
        return new XianTeSeYuanliao();
    }
}
