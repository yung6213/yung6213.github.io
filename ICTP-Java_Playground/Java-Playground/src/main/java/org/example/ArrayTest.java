package org.example;

public class ArrayTest {
    public static void main(String[] args) {
        // 배열 생성
        int[] nums = new int[5];
        int[] nums2 = {1,2,3,4,5};

        int nums3 = nums2[4]; // 5

        String[] strs = {"hello","world","icpt","great"};
        for(int i = 0; i < strs.length; i++){
            System.out.println(strs[i]);
        }
    }
}
