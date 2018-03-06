package com.ghj.example.decorator;

public class ArmEquip implements IEquip {
    @Override
    public int calcuateAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "屠龙刀";
    }
}
