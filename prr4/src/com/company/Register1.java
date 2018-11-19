package com.company;

public class Register1 extends Worker{
    public Register1 (String name, RegistryOffice regOffice){
        super(name, regOffice);
    }

    public void marry(int id){

        if(regOffice.getMarAppFromListById(id) != null){
            regOffice.getMarAppFromListById(id).Complete();
            System.out.println("Married successfully");
        } else {
            System.out.println("no application with such an id");
        }
    }
}
