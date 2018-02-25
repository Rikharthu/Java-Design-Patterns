package com.example.command.idea;

public class Invoker {

    private ICommand on;
    private ICommand off;
    private ICommand up;
    private ICommand down;

    public Invoker(ICommand on, ICommand off, ICommand up, ICommand down) {
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
    }

    public void clickOn() {
        System.out.println("Clicked on");
        on.execute();
    }

    public void clickOff() {
        System.out.println("Clicked off");
        off.execute();
    }

    public void clickUp() {
        System.out.println("Clicked up");
        up.execute();
    }

    public void clickDown() {
        System.out.println("Clicked down");
        down.execute();
    }

}
