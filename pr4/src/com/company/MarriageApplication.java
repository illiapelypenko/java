package com.company;

public class MarriageApplication extends Application{
    public MarriageApplication(){
        super();
    }

    public void Complete(){//да метод один на все три класса, в дальнейшем реализация будет разная
        if(!getIsCompleted()){
            setIsCompleted(true);
            System.out.println("Заявка выполнена успешно");
        } else {
            System.out.println("Данная заявка уже выполнена");
        }
    }
}
