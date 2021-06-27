package com.company;

public class Main3 {
    public static void main(String[] args) {
        String str = "водопад";

        str = str.replace('а','*');
        str = str.replace('о','а');
        str = str.replace('*','о');

        System.out.println(str);
    }
}