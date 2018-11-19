package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    Scanner scanner = new Scanner(System.in);
    RegistryOffice office = new RegistryOffice();
    Administrator admin = new Administrator("Tom", office);
    Register1 reg1 = admin.getNewRegister1("Jack");
    Register2 reg2 = admin.getNewRegister2("Timmy");

    public void test(){
        createApps();
        showMarriageApplicationList();
        completeAppById(0);//complete marriage
        completeAppById(1);//complete not marriage
        completeAppById(8);//complete marriage
        completeAppById(9);//complete marriage
        completeAppById(12);//complete not marriage
        completeAppById(13);//complete not marriage

        showMarriageApplicationList();
    }

    public void createApps(){
        System.out.println("");
        reg2.createApplicationByType("marriage");
        reg2.createApplicationByType("123454");//не сделает
        reg2.createApplicationByType("birth");
        reg2.createApplicationByType("marriage");
        reg2.createApplicationByType("error");//не сделает
        reg2.createApplicationByType("marriage");
        reg2.createApplicationByType("birth");
        reg2.createApplicationByType("death");
        reg2.createApplicationByType("death");
        reg2.createApplicationByType("birth");
        reg2.createApplicationByType("marriage");
        reg2.createApplicationByType("marriage");
        reg2.createApplicationByType("death");
        reg2.createApplicationByType("error");//не сделает
        reg2.createApplicationByType("marriage");
        reg2.createApplicationByType("death");
        reg2.createApplicationByType("death");
        reg2.createApplicationByType("fdgjlkfdgl");//не сделает
        reg2.createApplicationByType("birth");
        reg2.createApplicationByType("marriage");
        reg2.createApplicationByType("death");
        System.out.println("");
    }

    public void showMarriageApplicationList() {
        ArrayList<MarriageApplication> list = office.getMarriageApplicationList();
        System.out.println("");
        System.out.println("ALL MARRIAGE APPLICATION LIST");
        System.out.println("****************************************************************************************************************************************************************************************************************************************************************************");
        System.out.printf("%30s %30s", "id", "is completed");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < office.getMarriageApplicationList().size(); i++){
            System.out.printf("%30s %30s", list.get(i).getId(), list.get(i).getIsCompleted());
            System.out.println("");

        }
        System.out.println("****************************************************************************************************************************************************************************************************************************************************************************");
        System.out.println("");
    }

    public void completeAppById(int id){
        System.out.println("");
        System.out.println("COMPLETING APP WITH ID" + id);
        reg1.marry(id);
        System.out.println("");
    }
}
