package com.company;

public class Outofrangeexpantion extends Exception{
    public Outofrangeexpantion(String message)
    {
        super(message);
    }
    @Override
    public String getMessage() {
        return "число не попадает в лимит long формата";
    }
}
