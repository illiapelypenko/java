package com.company;

public class Administrator extends Worker{
    public Administrator (String name, RegistryOffice regOffice){
        super(name, regOffice);
    }

    public Register1 getNewRegister1(String name){
        Register1 reg = new Register1(name, regOffice);
        return reg;
    }

    public Register2 getNewRegister2(String name){
        Register2 reg = new Register2(name, regOffice);
        return reg;
    }
}
