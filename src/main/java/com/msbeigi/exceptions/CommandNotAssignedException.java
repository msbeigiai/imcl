package com.msbeigi.exceptions;

public class CommandNotAssignedException extends Exception {
    String command;

    public CommandNotAssignedException(String command) {
        this.command = command;
    }

    @Override
    public String getMessage() {
        return "Command " + "'" + command + "'" + " is not assigned!";
    }
}
