package com.company;

import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks");
        System.out.println("Maths");
        int maths = sc.nextInt();
        System.out.println("Chemistry");
        int chem = sc.nextInt();
        System.out.println("Physics");
        int phy = sc.nextInt();
        System.out.println("English");
        int eng = sc.nextInt();
        System.out.println("Computer");
        int cpp = sc.nextInt();
        int total = (maths+phy+chem+eng+cpp);
        float frac = (float)total/500;
        System.out.println("Your total percentage is : "+ (frac*100)+"%");

    }
}
