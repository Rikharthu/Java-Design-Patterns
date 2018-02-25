package com.example.command.idea;

public class LighOnCommand implements ICommand {

    private Light light;

    public LighOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println(LighOnCommand.class.getSimpleName() + " executing");
        light.on();
    }

    @Override
    public void unexecute() {
        System.out.println(LighOnCommand.class.getSimpleName() + " unexecuting");
        light.off();
    }
}
