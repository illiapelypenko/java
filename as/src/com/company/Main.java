package com.company;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {

    public static void main(String args[]) throws Exception
    {
        String fileNameOutput = "/Users/illia/Desktop/OutputFile.txt";
        String fileName = "/Users/illia/Desktop/notsource.txt";


        Charset cs = Charset.defaultCharset() ;
        try (BufferedReader bReader = Files.newBufferedReader(Paths.get(fileName), cs)){

            PrintWriter outputStream = new PrintWriter(fileNameOutput);
            int lineNum = 0;
            String line = null;

            while ( (line = bReader.readLine() ) != null ) {
                lineNum++;

                outputStream.println(line.split(" ")[0]);

            }
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        FileReader fr=new FileReader(fileNameOutput);
        BufferedReader br=new BufferedReader(fr);
        String s;
        int countofLine = 0;
        String keyword="kek";
        while ((s=br.readLine())!=null){
            countofLine++;
            if(s.contains(keyword))
            {
                System.out.println(s);

                System.out.println("Your word : " + keyword + "  ,Nomer Stroki = " +countofLine);
            }
        }
    }
}