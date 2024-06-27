package org.example;

import java.util.ArrayList;


public class ArrayListT2 {
    public static void main(String[] args) {
        Person[] persons = new Person[15];
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("a", 22));
        list.add(new Person("b", 24));
        list.add(new Person("c", 30));
        Person p = list.get(0);
        for(Person pp : list){
            System.out.printf("name: %s, age: %s \n", pp.name, pp.age);
        }

        Person [] persons2 = new Person[]{
            new Person("a", 22),
            new Person("b", 24),
            new Person("c", 30),
        };
    }
}
class Person {
    String name;
    Integer age;
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
