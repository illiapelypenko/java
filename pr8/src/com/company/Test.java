package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Test
{
    static Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>(15);
    public void addLongs(){
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        list.add(600);
        list.add(700);
        list.add(800);
        list.add(900);
        list.add(1000);

        list.add(1100);
        list.add(1200);
        list.add(1300);
        list.add(1400);
        list.add(1500);
    }
    public void display(){
        System.out.println("Ваша коллекция:");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();
    }
    public  void test(String answer) {
        switch (answer){
            case "add":
                add();
                break;
            case "display":
                display();
                break;
            case "compare":
                compare();
                break;
            default:
                System.out.println("такої команди не існує");
                break;
        }
    }
    public void add(){
        int value=0;
        boolean isParseable = false;
        do {
            try{
                System.out.println("додати число ?");
                value = Integer.parseInt(scanner.nextLine());
                isParseable = true;
                if(value < 0){
                    throw new IntIsMinusExeption("");
                }
            }
            catch (NumberFormatException e){
                System.out.println("вы ввели не число, попробуйте еще раз");
                isParseable = false;
            }
            catch (IntIsMinusExeption e){
                System.out.println("вы ввели " + e.getMessage() + ", попробуйте еще раз");
                isParseable = false;
            }
        }
        while (!isParseable);
        list.add(value);
    }
    public void compare(){
        int value=0;
        boolean isParseable = false;
        do {
            try{
                System.out.println("Знайти найближайше число до числа ?");
                value = Integer.parseInt(scanner.nextLine());
                isParseable = true;
                if(value < 0){
                    throw new IntIsMinusExeption("");
                }
            }
            catch (NumberFormatException e){
                System.out.println("вы ввели не число, попробуйте еще раз");
                isParseable = false;
            }
            catch (IntIsMinusExeption e){
                System.out.println("вы ввели " + e.getMessage() + ", попробуйте еще раз");
                isParseable = false;
            }
        }
        while (!isParseable);
        int currentlength = 2147483646;
        int result = list.get(0);//100
        for(int i = 0; i < list.size(); i++){
            if(Math.abs(list.get(i)-value) < currentlength){//67
                result = list.get(i);
                currentlength = Math.abs(list.get(i)-value);
            }
        }
        System.out.println("Найближайше число: ");
        System.out.println(result);
    }
    public void start(){
        addLongs();
        Scanner scanner = new Scanner(System.in);
        System.out.println("(help - список всіх команд)");
        while(true){
            System.out.print("Введіть команду: ");
            String command = scanner.nextLine();
            if(command.equals("help")){
                System.out.println("help - список всіх команд");
                System.out.println("exit - вихід з програми");
                System.out.println("add - додати число у список");

                System.out.println("display - вивести список всіх чисел");

                System.out.println("compare - знайти найближайше число до числа введеного");

            } else if(command.equals("exit")){
                break;
            } else {
                test(command);
            }
        }
    }
}
