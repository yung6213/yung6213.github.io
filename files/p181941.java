package org.example;

public class    p181941 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/181941
    public static void main(String[] args) {
        String result = solution(new String[]{"a","b","c"});
        System.out.println(result);
    }

    public static String solution(String[] arr) {
        String answer = "";
        for(String s : arr){
            answer = answer.concat(s);
        }
        return answer;
    }
}

/*
* 문제 설명
문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

제한사항
1 ≤ arr의 길이 ≤ 200
arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
입출력 예
arr	result
["a","b","c"]	"abc"
*
* */
