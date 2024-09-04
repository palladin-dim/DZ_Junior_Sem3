package org.example;

/**
 * Задание 1: Создайте класс Person с полями name и age. Реализуйте сериализация и десериализацию этого класса в файл.
 * <p></p>
 *
 */

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Иван", 25);

        person.serialize("person.ser"); // Сериализация;

        Person deserializedPerson = Person.deserialize("person.ser"); // Десериализация;

        System.out.println("Имя: " + deserializedPerson.getName());
        System.out.println("Возраст: " + deserializedPerson.getAge());
    }
}