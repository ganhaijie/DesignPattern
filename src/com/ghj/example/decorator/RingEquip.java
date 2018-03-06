package com.ghj.example.decorator;

public class RingEquip  implements IEquip{
    @Override
    public int calcuateAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战戒指";
    }
}
