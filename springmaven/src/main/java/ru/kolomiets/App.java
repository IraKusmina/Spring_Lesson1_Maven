package ru.kolomiets;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Irina", "Kolomiets", 30);
        Person person2 = new Person("Ivan", "Kolomiets", 31);
        System.out.println("Демонстрация работы common lang toString(): " + person1);
        System.out.println("Демонстрация работы common lang equals: " + person1.equalsBuilder(person2));
        System.out.println("Демонстрация работы common lang HashCode: " + person1.hashCodeCommon());
    }
}
