package com.company;

public class IntIsMinusExeption extends Exception{
    public IntIsMinusExeption(String message)
    {
        super(message);
    }
    public String getMessage() {
        return "отрицательное число";
    }
}
