package org.example;

import java.util.ArrayList;

public class ArratListT {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.contains("c"));

        boolean isRemoved = list.remove("c");
        System.out.println(isRemoved);

        String result = list.remove(0);
        System.out.println(result);

        for(String s : list){
            System.out.printf("%s, ", s);
        }

    }
}
