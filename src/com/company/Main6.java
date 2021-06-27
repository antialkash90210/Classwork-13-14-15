package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input your phone: ");
        String text = input.nextLine();

        //String text = "+7(392)234-34-45";
        Pattern pattern = Pattern.compile("\\+7\\([0-9]{3}\\)[0-9]{3}-[0-9]{2}-[0-9]{2}");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find() == true) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }


        /*
        while (matcher.find() == true) {
            int startIndex = matcher.start();
            int finishIndex = matcher.end();
            String found = text.substring(startIndex, finishIndex);
            System.out.println(startIndex + " - " + finishIndex + " = " + found);
        }*/
    }
}