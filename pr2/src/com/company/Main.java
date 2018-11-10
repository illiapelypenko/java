package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String text = "";
        System.out.println("\n Данна программа виводе сумму всіх чисел у тексті \n");
        System.out.printf("Введіть '1' щоб використати дефолтний текст або щось щоб ввести власний:");
        Scanner scanner = new Scanner(System.in);
        String method = scanner.next();
        if(method.equals("1")){
            System.out.println("\n Дефолтний текст: \n");
            text =
                            "10 Peace is a lie. There is only Passion.\n" +
                            "Through 20 Passion I gain Strength.\n" +
                            "Throu30gh Strength I gain Power.\n" +
                            "Through Power I gain Victory.\n" +
                            "Through Victory my chains are Broken.\n" +
                            "The Force shall free me.100\n";
            System.out.printf(text);
        }
        else {
            System.out.println("\n Введіть свій текст(клавіша enter переносить текст на нову строку, текст '!exit!' закінчує ввод тексту): ");
            while (true){
                String str = scanner.next();
                if(str.equals("!exit!")){
                    break;
                }
                text += str + "/n";
            }
        }
        int sum = 0;
        String number = "";
        for(int i = 0; i < text.length(); i++){
            if(Character.isDigit(text.charAt(i))){
                number += text.charAt(i);
            } else {
                if(number != ""){
                    sum += Integer.parseInt(number);
                    number = "";
                }
            }
        }
        if(number != ""){
            sum += Integer.parseInt(number);
            number = "";
        }
        System.out.println();
        System.out.println("Сумма числ у тексті: " + sum);
    }
}
//