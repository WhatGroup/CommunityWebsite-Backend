package com.gb.exception;

public class InvalidTokenException extends Exception {
    public InvalidTokenException(String message) {
        super(message);
    }

    public InvalidTokenException() {
        super("无效token");
    }
}
