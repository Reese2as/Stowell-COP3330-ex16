/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int age;
        final int legal_age = 16;

        System.out.print("What is your age? ");
        age = user_input.nextInt();

        System.out.println(age >= legal_age ? "You are old enough to legally drive." : "You are not old enough to legally drive.");
    }
}

