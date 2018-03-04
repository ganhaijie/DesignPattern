package com.ghj.example.command;

public class DoorOpen implements Commond {

    private Door door;

    public DoorOpen(Door door){
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
