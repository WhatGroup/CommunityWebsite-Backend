package com.gb.exception;

public class NoPermissionException extends Exception {
    public NoPermissionException() {
        super("你没有该权限");
    }
}
