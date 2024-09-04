package org.example;

import java.io.*;

public class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void serialize(String fileName) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);

            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(this);

            objectOut.close();
            fileOut.close();

            System.out.println("Объект сериализован и сохранен в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Person deserialize(String fileName) {
        Person person = null;
        try {

            FileInputStream fileIn = new FileInputStream(fileName);

            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            person = (Person) objectIn.readObject();

            objectIn.close();
            fileIn.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return person;
    }
}


