package org.example.mapexample;

import java.util.HashMap;

public class MapTest2 {
    public static void main(String[] args) {
        HashMap<String,Person> users = new HashMap<String, Person>();

    users.put("1", new Person("jhjeong","myPassword","jj@gg.com","jhdescription"));
    users.put("2", new Person("hkj", "pwhkj", "hkj@cc.com", "deschkj" ));
    users.put("3", new Person("ggk", "gndj", "ggk@gg.com", "descggk"));

    for(String key : users.keySet()) {
        Person person = users.get(key);
        System.out.printf("(id)%s = (pw)%s \n "
                , person.id
                , person.pw);
    }
    }
}