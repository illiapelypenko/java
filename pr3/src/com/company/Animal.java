package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animal {
    private static ArrayList<Animal> animals = new ArrayList<Animal>();
    public static ArrayList getAnimals() { //геттер
        return animals;
    }
//    public static void setAnimals(ArrayList animalsList) { //сеттер
//        animals=animalsList;
//    }
    static Scanner scanner = new Scanner(System.in);
    //String method = scanner.next();

    private String type;
    private String clas;
    private String kind; //сімейство
    private String family; //рід
    private String species; //вид
    private String subspecies; //підвид
    private String color;
    private int age;

    //get set
    public String getType() { //геттер
        return this.type;
    }
    public void setType(String type) { //сеттер
        this.type=type;
    }

    public String getClas() { //геттер
        return this.clas;
    }
    public void setClas(String clas) { //сеттер
        this.clas=clas;
    }

    public String getKind() { //геттер
        return this.kind;
    }
    public void setKind(String kind) { //сеттер
        this.kind=kind;
    }

    public String getFamily() { //геттер
        return this.family;
    }
    public void setFamily(String family) { //сеттер
        this.family=family;
    }

    public String getSpecies() { //геттер
        return this.species;
    }
    public void setSpecies(String species) { //сеттер
        this.species=species;
    }

    public String getSubspecies() { //геттер
        return this.subspecies;
    }
    public void setSubspecies(String subspecies) { //сеттер
        this.subspecies=subspecies;
    }

    public String getColor() { //геттер
        return this.color;
    }
    public void setColor(String color) { //сеттер
        this.color=color;
    }

    public int getAge() { //геттер
        return this.age;
    }
    public void setAge(int age) { //сеттер
        this.age=age;
    }


    public Animal(String type, String clas, String kind, String family, String species, String subspecies, String color, int age){
        this.type = type;
        this.clas = clas;
        this.kind = kind;
        this.family = family;
        this.species = species;
        this.subspecies = subspecies;
        this.color = color;
        this.age = age;

        AddAnimalToList(this);
    }

    //Animal panda = createAnimal();
    public static void createAnimalFromInput(){
        Animal animal;
        System.out.println("Animal's type: ");
        String type = scanner.nextLine();
        System.out.println("Animal's clas: ");
        String clas = scanner.nextLine();
        System.out.println("Animal's kind: ");
        String kind = scanner.nextLine(); //сімейство
        System.out.println("Animal's family: ");
        String family = scanner.nextLine(); //рід
        System.out.println("Animal's species: ");
        String species = scanner.nextLine(); //вид
        System.out.println("Animal's subspecies: ");
        String subspecies = scanner.nextLine(); //підвид
        System.out.println("Animal's color: ");
        String color = scanner.nextLine();




        int age = 0;
        boolean isParseable = false;
        do{
            try {
                System.out.println("Animal's age: ");
                age = Integer.parseInt(scanner.nextLine());
                isParseable = true;
                if(age < 0){
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


        animal = new Animal(type, clas, kind, family, species, subspecies, color, age);
    }
    public static void AddAnimalToList(Animal animal){
        if(!animals.contains(animal)){
            animals.add(animal);
        } else {
            System.out.println("Данный екземпляр уже находиться в коллекции");
        }
    }
    //toString
    public static void ShowAnimalsList(){
        System.out.println("****************************************************************************************************************************************************************************************************************************************************************************");
        System.out.printf("%12s %12s %12s %12s %12s %12s %12s %12s", "Type", "Clas", "Kind", "Family", "Species", "SubSpecies", "Color", "Age");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < animals.size(); i++){
            System.out.printf("%12s %12s %12s %12s %12s %12s %12s %12s", animals.get(i).getType(), animals.get(i).getClas(), animals.get(i).getKind(), animals.get(i).getFamily(), animals.get(i).getSpecies(), animals.get(i).getSubspecies(), animals.get(i).getColor(), animals.get(i).getAge());
            System.out.println("");

        }
        System.out.println("****************************************************************************************************************************************************************************************************************************************************************************");

    }
    public static void ShowAnimalsListByYear(){
        int age = 0;
        boolean isParseable = false;
        do{
            try {
                System.out.println("Higher than age ?");
               age = Integer.parseInt(scanner.nextLine());
                isParseable = true;
                if(age < 0){
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

        System.out.println("****************************************************************************************************************************************************************************************************************************************************************************");
        System.out.printf("%12s %12s %12s %12s %12s %12s %12s %12s", "Type", "Clas", "Kind", "Family", "Species", "SubSpecies", "Color", "Age");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < animals.size(); i++){
            if(animals.get(i).getAge() > age)
            {
                System.out.printf("%12s %12s %12s %12s %12s %12s %12s %12s", animals.get(i).getType(), animals.get(i).getClas(), animals.get(i).getKind(), animals.get(i).getFamily(), animals.get(i).getSpecies(), animals.get(i).getSubspecies(), animals.get(i).getColor(), animals.get(i).getAge());
                System.out.println("");
            }
        }
        System.out.println("****************************************************************************************************************************************************************************************************************************************************************************");
    }
    public static void ShowAnimalsListByFamily(){
        System.out.println("by family");
        String family = scanner.nextLine();
        System.out.println("****************************************************************************************************************************************************************************************************************************************************************************");
        System.out.printf("%12s %12s %12s %12s %12s %12s %12s %12s", "Type", "Clas", "Kind", "Family", "Species", "SubSpecies", "Color", "Age");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < animals.size(); i++){
            if(animals.get(i).getFamily().equals(family))
            {
                System.out.printf("%12s %12s %12s %12s %12s %12s %12s %12s", animals.get(i).getType(), animals.get(i).getClas(), animals.get(i).getKind(), animals.get(i).getFamily(), animals.get(i).getSpecies(), animals.get(i).getSubspecies(), animals.get(i).getColor(), animals.get(i).getAge());
                System.out.println("");
            }
        }
        System.out.println("****************************************************************************************************************************************************************************************************************************************************************************");
    }
    public static void ShowAnimalsListBySpeciesColor(){
        System.out.println("by species");
        String species = scanner.nextLine();
        System.out.println("by color");
        String color = scanner.nextLine();
        System.out.println("****************************************************************************************************************************************************************************************************************************************************************************");
        System.out.printf("%12s %12s %12s %12s %12s %12s %12s %12s", "Type", "Clas", "Kind", "Family", "Species", "SubSpecies", "Color", "Age");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < animals.size(); i++){
            if(animals.get(i).getSpecies().equals(species) && animals.get(i).getColor().equals(color))
            {
                System.out.printf("%12s %12s %12s %12s %12s %12s %12s %12s", animals.get(i).getType(), animals.get(i).getClas(), animals.get(i).getKind(), animals.get(i).getFamily(), animals.get(i).getSpecies(), animals.get(i).getSubspecies(), animals.get(i).getColor(), animals.get(i).getAge());
                System.out.println("");
            }
        }
        System.out.println("****************************************************************************************************************************************************************************************************************************************************************************");
    }
}
