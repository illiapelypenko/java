package com.company;

import java.util.Scanner;

public class Test {
    public void test(){
        createAnimals();

        Scanner scanner = new Scanner(System.in);
        System.out.println("(help - список всіх команд)");
        while(true){
            System.out.print("Введіть команду: ");
            String command = scanner.nextLine();
            if(command.equals("help")){
                System.out.println("help - список всіх команд");
                System.out.println("exit - вихід з програми");
                System.out.println("add animal - додати тварину у список");

                System.out.println("sfal (show full animal list) - вивести повний список тварин");

                System.out.println("salby (show animal list by year) - вивести список всіх тварин старше заданого віку");
                System.out.println("salbf (show animal list by family) - вивести список всіх тварин заданого сімейства");
                System.out.println("salbsc (show animal list by species and color) - вивести список всіх тварин заданного виду та окрасу");

            } else if(command.equals("exit")){
                break;
            } else {
                workWithAnimalClass(command);
            }


        }

    }
    public static void workWithAnimalClass(String answer) {
        switch (answer){
            case "add animal":
                Animal.createAnimalFromInput();
                break;
            case "sfal":
                Animal.ShowAnimalsList();
                break;
            case "salby":
                Animal.ShowAnimalsListByYear();
                break;
            case "salbf":
                Animal.ShowAnimalsListByFamily();
                break;
            case "salbsc":
                Animal.ShowAnimalsListBySpeciesColor();
                break;
            default:
                System.out.println("такої команди не існує");
                break;
        }
    }
    public void createAnimals(){
        Animal dog = new Animal("dog t", "dog c", "dog k", "dog f", "dog s", "dog ss",
                "dog c", 5);
        Animal cat1 = new Animal("cat1 t", "cat1 c", "cat1 k", "cat f", "cat s", "cat ss",
                "black c", 10);
        Animal cat2 = new Animal("cat t", "cat c", "cat k", "cat f", "cat s", "cat ss",
                "black c", 15);
        Animal panda = new Animal("panda t", "panda c", "panda k", "panda f", "panda s", "panda ss",
                "black white", 20);
    }
}
