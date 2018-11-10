package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//Варіант: 16  Завдання: 6 - byte - Виконати циклічний зсув матриці на n позицій вгору
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static byte [][] array;
    static int N;
    public static void main(String[] args) {
        System.out.println("Розробник - Пелипенко I.Г.");
        System.out.println(" ");
        while(true){
            start();
            System.out.print("Введіть 'go' щоб продовжиди: ");
            System.out.println("Введіть щось щоб вийти: ");
            String answer = scanner.nextLine();
            if(!answer.equals("go")){
                break;
            }

        }
    }
    public static void showMatrix(){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.printf("%6d", array[i][j]);
            }
            System.out.println("");
        }
    }
    public static void start(){
        System.out.printf("Введіть N: ");
        N = Integer.parseInt(scanner.nextLine());
        array = new byte[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                array[i][j] = (byte)(Math.random()*100);
            }
        }//
        System.out.println(" ");
        System.out.println("До обробки:");
        showMatrix();
        System.out.println(" ");
        System.out.printf("Введіть n: ");
        int n = Integer.parseInt(scanner.nextLine());
        for( int i = 0; i < n; i++ ){
            byte[] row1 = array[0];
            for(int j = 0; j < array.length - 1; j++){
                array[j] = array[j+1];
            }
            array[array.length - 1] = row1;
        }
        System.out.println(" ");
        System.out.println("Після обробки:");
        showMatrix();
        System.out.println(" ");
    }
}