package com.company;

import java.io.*;
import java.util.Scanner;

class Main {

    public static void main(String args[]) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Яке слово шукати ?");
        String word = scanner.nextLine();
        System.out.println("У якому файлі (на робочому столі) шукати ?");
        String fileToRead = scanner.nextLine();
        System.out.println("До якого файлу (на робочому столі) записати результат ?");
        String fileToWrite = scanner.nextLine();
        try {
            FileReader fr = new FileReader("/Users/illia/Desktop/" + fileToRead);
            Scanner scan = new Scanner(fr);
            String line = "";
            while (scan.hasNextLine()){
                line = scan.nextLine();
                if(line.indexOf(word) > -1){
                    count++;
                }
            }
            FileWriter fw = new FileWriter("/Users/illia/Desktop/" + fileToWrite);
            fw.write("Слово " + word + " зустрічаеться " + count + " разів у файлі " + fileToRead);
            fr.close();
            fw.close();
            System.out.println("Зміст файлу " + fileToWrite);
            fr = new FileReader("/Users/illia/Desktop/" + fileToWrite);
            scan = new Scanner(fr);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("файл не знайдено");
        }
    }
}