package com.example.command.idea;

public class Light {

    public void on() {
        System.out.println(Light.class.getSimpleName() + ": Turning on");
    }

    public void off() {
        System.out.println(Light.class.getSimpleName() + ": Turning off");
    }
}
