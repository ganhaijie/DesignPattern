package com.ghj.example.command;

public class LightOn implements Commond {

    private Light light;

    public LightOn(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
