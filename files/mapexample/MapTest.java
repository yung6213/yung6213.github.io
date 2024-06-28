package org.example.mapexample;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("id", "jhjeongid");
        map.put("pw", "myPassword");
        map.put("email", "jhjeongid@gmail.com");
        map.put("description", "this is description");

        System.out.println(map.get("pw"));

        System.out.println(map.containsKey("email"));

        System.out.println(map.containsValue("jhjeongid"));

       System.out.println(map.remove("description","jhjeongid@naver.com"));
       System.out.println(map.remove("description","jhjeongid@gmail.com"));
       System.out.println(map.size());

       for(String key : map.keySet()){
           System.out.printf("(key)%s = (value)%s \n ", key, map.get(key));
       }
    }
}
