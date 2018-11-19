package com.company;

public class BirthApplication extends Application{
    public BirthApplication(){
        super();
    }

    public void Complete(){
        if(!getIsCompleted()){
            setIsCompleted(true);
            System.out.println("Заявка выполнена успешно");
        } else {
            System.out.println("Данная заявка уже выполнена");
        }
    }
}
