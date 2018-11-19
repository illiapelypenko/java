package com.company;

public class Register2 extends Worker{
    public Register2 (String name, RegistryOffice regOffice){
        super(name, regOffice);
    }

    public void createApplicationByType(String type){
        if(type.equals("marriage") || type.equals("birth") || type.equals("death")){
            switch(type) {
                case"marriage":
                    regOffice.getMarriageApplicationList().add(new MarriageApplication());
                    break;
                case"birth":
                    regOffice.getBirthApplicationList().add(new BirthApplication());
                    break;
                case"death":
                    regOffice.getDeathApplicationList().add(new DeathApplication());
                    break;
            }
            System.out.println("Заявление " + type + " создано успешно");
        } else {
            System.out.println("Неверный тип заявления " + type);
        }
    }
}

