package org.example;

public class p181943 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181943
    public static void main(String[] args) {
        String result = solution("aaaaaa","bbb",3);
        System.out.println(result);
    }


    public static String solution(String my_string, String overwrite_string, int s) {
        //
        String before = my_string.substring(0, s);
        String after = my_string.substring(s+overwrite_string.length());
        return before + overwrite_string + after;
    }
}