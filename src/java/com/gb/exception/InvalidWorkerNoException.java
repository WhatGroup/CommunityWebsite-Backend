package com.gb.exception;

public class InvalidWorkerNoException extends Exception {

    public InvalidWorkerNoException() {
        super("无效工号");
    }

    public InvalidWorkerNoException(String message) {
        super(message);
    }
}
