/*
    1) Write a Java program to convert string to lowercase
    2) Write a Java Program to replace spaces with underscore
    3) Write a java program to enter a string variable inside a string
    4) Write a java program to detect double and triple spaces in the string
    5) Wrie a java program to enter a string with escape characters
 */
package com.company;

import java.util.Scanner;

public class PractiseSet2 {
    public static void main(String[] args) {
        //ans1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings");
        String strUp = sc.next();
        System.out.println(strUp.toLowerCase());
        //ans2
        String str = "Hi this is Karan. Nice to meet you";
        System.out.println(str.replace(' ','_'));
        //ans3
        String name = "Karan";
        System.out.printf("letter =Dear %s ,Thanks a lot\n",name);
        //ans4
        String mystr = "This string  has double and   triple spaces";
        System.out.println(mystr.indexOf("  "));
        System.out.println(mystr.indexOf("   "));

    }
}
