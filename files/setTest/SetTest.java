package org.example.setTest;

import java.util.Arrays;
import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);

        HashSet<Integer> s1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<Integer>(Arrays.asList(4,5,6,7,8,9));

        HashSet<Integer> intersection = new HashSet<Integer> (s1);
        intersection.retainAll(s2);
        System.out.println(intersection);

        HashSet<Integer> union = new HashSet<Integer>(s1);
        union.addAll(s2);
        System.out.println(union);

        HashSet<Integer> substract = new HashSet<Integer>(s1);
        substract.removeAll(s2);
        System.out.println(substract);
    }
}
