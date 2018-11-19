package com.company;

public class Application extends RegistryOffice{
    private int id;
    private static int nextId = 0;
    private boolean isCompleted = false;

    public Application(){
        id = nextId;
        nextId++;
    }

    public int getId(){ return id; }
    public int getNextId(){ return nextId; }
    public boolean getIsCompleted(){ return isCompleted; }
    protected void setIsCompleted(boolean boo){isCompleted = boo;}

    public void Complete(){}

}