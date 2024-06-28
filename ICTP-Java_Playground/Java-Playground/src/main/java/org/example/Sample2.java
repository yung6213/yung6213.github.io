package org.example;

class Animal2 {
    String name;
    int age ;
    public Animal2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal2(String name) {
        this.name = name;
    }
    public Animal2(int age){
        this.age = age;
    }
    public Animal2() {}

}

public class Sample2 {
    public static void main(String[] args){
        Animal2 a1 = new Animal2();
        Animal2 a2 = new Animal2("poppy", 10);
        Animal2 a3 = new Animal2(15);
        Animal2 a4 = new Animal2("puppy");

    }
}
