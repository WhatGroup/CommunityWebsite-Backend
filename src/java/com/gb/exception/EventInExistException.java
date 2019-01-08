package com.gb.exception;

public class EventInExistException extends Exception {

    public EventInExistException(String message) {
        super(message);
    }

    public EventInExistException() {
        super("无效token");
    }
}
