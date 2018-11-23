package com.company;

public class IntIsZeroException extends Exception{
    public IntIsZeroException(String message)
    {
        super(message);
    }
    public String getMessage() {
        return "не может быть 0";
    }
}