package com.example.command.idea;

public interface ICommand {

    void execute();
    void unexecute(); // support undo operation
}
