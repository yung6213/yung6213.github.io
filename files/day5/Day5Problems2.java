package org.example.day5;

public class Day5Problems2 {
    public int solution(int a, int b, boolean flag) {

        if(flag){
            return plus(a,b);
        } else {
            return minus(a,b);
        }
    }

    public int plus(int a, int b) {return a+b;}
    public int minus(int a, int b) {return a-b;}
}