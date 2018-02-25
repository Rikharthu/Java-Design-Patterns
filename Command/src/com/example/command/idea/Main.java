package com.example.command.idea;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        Invoker invoker = new Invoker(
                new LighOnCommand(light),
                new LighOnCommand(light),
                new LighOnCommand(light),
                new LighOnCommand(light));
        invoker.clickOn();
    }
}
