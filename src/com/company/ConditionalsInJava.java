package com.company;

public class ConditionalsInJava {
    public static void main(String[] args) {
        int age = 14;
//        if(age>18){
//            System.out.println("you can drive buddy");
//        }
//        else{
//            System.out.println("you cant drive till you turn 18 buddy");
//        }
//
        boolean ifTrue = (age>10);
        if(ifTrue){
            System.out.println("age is greater than 10");
        }
        else{
            System.out.println("age not greater than 10");
        }

    }
}
