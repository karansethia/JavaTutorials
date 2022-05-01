package com.company;

public class loops2 {
    public static void main(String[] args) {
//        for(int i = 0;i<5;i++){
//            if(i==2){
//                System.out.println("loop breaked");
//                continue;
//            }
//            System.out.println(i+" Inside the for loop");
        for(int i=0; i<=50; i++){
            System.out.println("welcome to examination");
            if(i%2==0){
                System.out.println(i+" This is even question paper");
                continue;
            }
            System.out.println(i+" this is odd question paper");
        }
        }
    }

