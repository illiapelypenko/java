package com.company;

public class DeathApplication extends Application{
    public DeathApplication(){
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
