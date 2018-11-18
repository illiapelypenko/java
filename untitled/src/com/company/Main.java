package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class Person {
    int age;
    public Person(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
class Test {
    Person tom = new Person(90);
    public void test(){
        System.out.println(tom.getAge());
    }
}
