package com.company;

public class Main4 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('d');
        stringBuilder.append('o');
        stringBuilder.append('g');

        String str = "dog";
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(1);
        //str = sb.toString();
        str = new String(sb);

        System.out.println(str);
    }
}