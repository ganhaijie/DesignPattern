package com.ghj.example.command;

public class CommonPanel {

    private static final int CONTROL_SIZE = 5;
    private Commond[] commands;

    public CommonPanel(){
        commands = new Commond[CONTROL_SIZE];
        for (int i = 0; i < CONTROL_SIZE; i++)
        {
            commands[i] = new NoCommand();
        }
    }

    public void setCommands(int index,Commond commond){
        this.commands[index]=commond;
    }

    public void keyPressed(int index)
    {
        commands[index].execute();
    }

}
