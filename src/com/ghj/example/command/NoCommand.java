package com.ghj.example.command;

public class NoCommand implements Commond {
    @Override
    public void execute() {
        System.out.println("这个命令无效");
    }
}
