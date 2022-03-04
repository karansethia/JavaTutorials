package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");
        int a=2,b=3,c=5;
        int d = a + b + c;
        System.out.println(d);
        // Program to get Primitive data type
        //byte num1 = 120;
        float num2 = 2.45f;
        System.out.println(((Object)num2).getClass().getSimpleName());
        // Program to get Non-Primitive data type
        //String str = "Hi karan";
        int[] arr = new int[2];
        System.out.println(arr.getClass().getSimpleName());
        // Taking user input
        Scanner s = new Scanner(System.in); //System.in specifies that the program will take input from keyboard
        int num3 = s.nextInt();
        System.out.println("Inputted number is : "+num3);
    }
}
