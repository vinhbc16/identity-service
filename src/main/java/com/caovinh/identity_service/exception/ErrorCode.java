package com.caovinh.identity_service.exception;

public enum ErrorCode {
    USER_EXISTS(1006, "User already exists"),
    USER_NOT_FOUND(1002, "User not found"),
    INTERNAL_SERVER_ERROR(9999, "Internal server error"),
    USERNAME_INVALID(1004, "Username must be at least 3 characters"),
    PASSWORD_INVALID(1007, "Password must be at least 8 characters"),
    INVALID_KEY(1005, "Invalid key");

    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
