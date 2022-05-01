package com.company;

public class practisesetloops {
    public static void main(String[] args) {
        System.out.println("practise set of loops");
        //Problem 1  Write a program to print the following pattern :
//        ****
//        ***
//        **
//        *
        int n = 4;
        for(int i=n; i>0;i--){
           for(int j=0; j<i; j++){
               System.out.print("*");
           }
           System.out.print("\n");
       }
//
//
//        Problem 2   Write a program to sum first n even numbers using a while loop.
        int sum = 0;
        int x = 10;
        for(int i=0;i<=x;i++){
            sum += i;
        }
        System.out.println(sum);


//        Problem 3  Write a program to print the multiplication table of a given number n.
        int y = 5;
        for(int i=1;i<=10;i++){
            System.out.println(i*y);
        }

        //Problem 4  Write a program to print a multiplication table of 10 in reverse order.
        int z = 10;
        for(int i=10;i>=0;i--){
            System.out.println(i*z);
        }
//
        //Problem 5  Write a program to find the factorial of a given number using for loops.
        int a = 5;
        int fact=1;
        for(int i=1;i<=a;i++){
            fact *= i;
        }
        System.out.println(fact);



    }
}
