package com.company;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        String expression;
        Scanner input = new Scanner(System.in);

        int counter = 0;
        final char LEFT_BRACKET = '(';
        final char RIGHT_BRACKET = ')';
        boolean rightExpression = true;

        System.out.print("input expression: ");
        expression = input.nextLine();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == LEFT_BRACKET) {
                counter++;
            } else if (expression.charAt(i) == RIGHT_BRACKET) {
                counter--;
                if (counter < 0) {
                    rightExpression = false;
                    break;
                }
            }
        }

        if (rightExpression == true) {
            if (counter == 0) {
                System.out.println("OK");
            } else {
                System.out.println("ERROR");
            }
        } else {
            System.out.println("ERROR");
        }
    }
}