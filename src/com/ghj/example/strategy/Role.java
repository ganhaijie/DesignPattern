package com.ghj.example.strategy;

public abstract class Role {
    protected String name;

/*    protected abstract void display();

    protected abstract void run();

    protected abstract void attack();

    protected abstract void defend();*/

    protected IAttackBehavior iAttackBehavior;

    protected IDefendBehavior iDefendBehavior;

    protected IDisplayBehavior iDisplayBehavior;


    public IAttackBehavior getiAttackBehavior() {
        return iAttackBehavior;
    }

    public void setiAttackBehavior(IAttackBehavior iAttackBehavior) {
        this.iAttackBehavior = iAttackBehavior;
    }

    public IDefendBehavior getiDefendBehavior() {
        return iDefendBehavior;
    }

    public void setiDefendBehavior(IDefendBehavior iDefendBehavior) {
        this.iDefendBehavior = iDefendBehavior;
    }

    public IDisplayBehavior getiDisplayBehavior() {
        return iDisplayBehavior;
    }

    public void setiDisplayBehavior(IDisplayBehavior iDisplayBehavior) {
        this.iDisplayBehavior = iDisplayBehavior;
    }

    public void display(){
        iDisplayBehavior.display();
    }

    public void attack(){
        iAttackBehavior.attack();
    }

    public void defend(){
        iDefendBehavior.defend();
    }
}

