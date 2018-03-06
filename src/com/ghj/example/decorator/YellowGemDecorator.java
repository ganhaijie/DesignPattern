package com.ghj.example.decorator;

public class YellowGemDecorator implements IEquipDecorator {

    private IEquip equip;

    public YellowGemDecorator(IEquip equip)
    {
        this.equip = equip;
    }


    @Override
    public int calcuateAttack() {
        return 10 + equip.calcuateAttack();
    }

    @Override
    public String description()
    {
        return equip.description() + "+ 黄宝石";
    }
}
