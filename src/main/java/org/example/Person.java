package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;
    private final List<String> listOfNames = new ArrayList<>();

    public Person() {
    }


    public Person(String name) {
        //  Need Test Case
        this.name = name;
    }

    public Person(int age) {
        //  Need Test Case
        this.age = age;
    }

    public Person(String name, int age) {
        //  Need Test Case
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        //  Need Test Case
        this.name = name;
    }

    public void setAge(int age) {
        //  Need Test Case
        this.age = age;
    }

    public String getName() {
        //  Need Test Case
        return name;
    }

    public Integer getAge() {
        //  Need Test Case
        return age;
    }

    public List<String> getListOfNames() {
        return listOfNames;
    }

    public void addName(String name){
        //  Need Test Case
        listOfNames.add(name);

    }

    public void removeName(String name){
        //  Need Test Case
        listOfNames.remove(name);

    }

    public int getSizeOfList(){
        int listSize;
        listSize = listOfNames.size();
        return listSize;
    }




}
