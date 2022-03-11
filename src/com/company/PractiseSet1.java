//  Write a program to sum three numbers in Java.
//  Write a program to calculate CGPA using marks of three subjects (out of 100)
//  Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
//  Write a Java program to detect whether a number entered by the user is an integer or not.

package com.company;

import java.util.Scanner;

public class PractiseSet1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //first
        System.out.println("Enter three digits");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("sum = "+(a+b+c));
        //second
        System.out.println("Enter marks for three subjects");
        float math = sc.nextFloat();
        float phy = sc.nextFloat();
        float chem = sc.nextFloat();
        float percent = (((math+phy+chem)/300)*100);
        System.out.println("Your cgpa is : "+ (percent/9.5));
        //third
        String name = sc.next();
        System.out.println("Hello "+name+", have a good day");
        //fourth
        System.out.println(sc.hasNextInt());

    }
}
