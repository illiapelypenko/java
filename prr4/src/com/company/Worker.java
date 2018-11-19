package com.company;

public class Worker extends RegistryOffice{
    String name;
    RegistryOffice regOffice;

    public Worker(String name, RegistryOffice regOffice){
        this.name = name;
        this.regOffice = regOffice;
    }
}
