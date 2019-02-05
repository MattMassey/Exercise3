package com.company.week1;
import java.util.*;
//Matthew Massey, 2/5/2019
//Project 3, CSCI-1660
//Program takes input fahrenheit temp and converts it to celsius, until a number lower than -460 is inputted.

public class Main {
    static Scanner input = new Scanner(System.in);
    static double tempF;
    static double tempC;

    public static void main(String[] args) {

        while (true) {
            collectInput();
            if (tempF < -460) {
                break;
            }
            convertTemp();
            displayCels();
        }
        System.out.println("That's too cold!");
    }

    public static void collectInput() {
        System.out.println("Temperature in Fahrenheit?");
        tempF = Double.parseDouble(input.nextLine());
    }

    public static void convertTemp() {
        tempC = (tempF - 32) * 5 / 9;
    }

    public static void displayCels() {
        System.out.println(tempF + " degrees F is " + tempC + " in Celsius");
    }
}