package com.ghj.example.command;

public class Test {



    public static void main(String[] args) {
         Door door = new Door();

         Light light = new Light();

         CommonPanel commonPanel = new CommonPanel();

        commonPanel.setCommands(0,new LightOn(light));
        commonPanel.setCommands(1,new DoorOpen(door));

        commonPanel.keyPressed(0);
        commonPanel.keyPressed(2);
        commonPanel.keyPressed(1);
    }

}
