package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String question = null;
        String rightAnswer = null;
        char[] userAnswer = null;
        boolean finishGame;
        char currentLetter;
        int countStars;
        boolean findLetter;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите вопрос: ");
        question = input.nextLine();

        System.out.print("Введите правильный ответ: ");
        rightAnswer = input.nextLine();

        userAnswer = new char[rightAnswer.length()];
        for (int i = 0; i < userAnswer.length; i++) {
            userAnswer[i] = '*';
        }

        //clear console
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        do {
            System.out.println();

            System.out.println(question);
            System.out.print("Загаданное слово: ");
            for (int i = 0; i < userAnswer.length; i++) {
                System.out.print(userAnswer[i] + " ");
            }
            System.out.println();

            System.out.print("Введите букву: ");
            currentLetter = input.nextLine().charAt(0);

            findLetter = false;
            for (int i = 0; i < rightAnswer.length(); i++) {
                if (rightAnswer.charAt(i) == currentLetter) {
                    userAnswer[i] = currentLetter;
                    findLetter = true;
                }
            }
            if (findLetter == false) {
                System.out.println("Такой буквы в этом слове нет");
            }

            countStars = 0;
            for (int i = 0; i < userAnswer.length; i++) {
                if (userAnswer[i] == '*') {
                    countStars++;
                }
            }

            if (countStars == 0) {
                finishGame = true;
            } else {
                finishGame = false;
            }

        } while (finishGame == false);

        System.out.println();
        System.out.println("Поздравляем, вы победили!!!");
        System.out.print("Загаданное слово: ");
        for (int i = 0; i < userAnswer.length; i++) {
            System.out.print(userAnswer[i] + " ");
        }
    }
}