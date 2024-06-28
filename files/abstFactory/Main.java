package org.example.abstFactory;

public class Main {
    public static void main(String[] args) {
        BeverageFactory fac = new CoffeeFactory();
        //BeverageTaster coffeeTaster = fac.maker("americano");
        //coffeeTaster.flavor();

        //fac = new JuiceFactory();
        //BeverageTaster juice = fac.maker("banana");
        //juice.flavor();
    }
}
