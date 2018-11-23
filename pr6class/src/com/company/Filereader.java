package com.company;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class Filereader {
    static int count = 0;
    public static void go(String word, String fileToRead, String fileToWrite){
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
            System.out.println("файл " + fileToRead + " не знайдено");
        } catch (IOException e){//не повинна бути
            System.out.println("помилка при роботі з файлами");
        }
}
}
