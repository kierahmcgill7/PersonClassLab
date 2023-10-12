package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    public void nameConstructorTest() {
    //Given what we expect
        String name;
        name = "Kierah";
    //When we are instantiating
        Person person = new Person(name);
    //That this is true?
        assertEquals(name, person.getName()); // (expectedOutcome, whatsTesting)
    }
    @Test
    public void ageConstructorTest() {
        int age;
        age = 22;
        Person person = new Person(age);
        assertEquals(age, person.getAge());
    }
    @Test
    public void nameAgeConstructorTest() {
        String name;
        int age;
        name = "Kierah";
        age = 22;
        Person person = new Person(name, age);
        assertEquals(name, person.getName());
        assertEquals(age, person.getAge());

    }
    @Test
    public void setNameTest() {
    String name;
    name = "Kiara";
        Person person = new Person();
        assertNull(person.getName());
        person.setName(name);
        assertEquals(name, person.getName());
    }

    @Test
    public void setAgeTest() {
        int age = 10;
        Person person = new Person();
        assertEquals(0, person.getAge());
        person.setAge(age);
        assertEquals(age, person.getAge());

    }

    @Test
    public void getNameTest() {
        String name = "Kiara";
        Person person = new Person(name);
        assertEquals(name, person.getName());
    }

    @Test
    public void getAgeTest() {
        int age = 41;
        Person person = new Person(age);
        assertEquals(age, person.getAge());
    }

    @Test
    public void addNameTest() {
        String name = "Andrea";
        Person person = new Person(name);
        person.addName("Mommom");
        assertTrue(person.getListOfNames().contains("Mommom"));
    }

    @Test
    public void removeNameTest() {
        String name = "Andrea";
        Person person = new Person(name);
        person.addName("Mommom");
        assertTrue(person.getListOfNames().contains("Mommom"));
        person.removeName("Mommom");
        assertFalse(person.getListOfNames().contains("Mommom"));
    }

}