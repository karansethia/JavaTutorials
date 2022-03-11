package com.company;

import java.util.Locale;

public class StringsInJava {
    public static void main(String[] args) {
        //Two ways to declare strings in java
        String name = new String("Karan");
        String name2  = "Karan";
        System.out.println(name);
        System.out.println(name2.length());
        System.out.println(name2.toLowerCase());
        System.out.println(name2.toUpperCase());
        String info = "       Karan is the best coder ever I aint lying     ";
        System.out.println(info.trim());
        System.out.println(name.substring(3));
        System.out.println(name2.substring(0,3));
        System.out.println(name.replace('n','v'));
        System.out.println(name2.replace("Ka","Sim"));
        System.out.println(name.startsWith("K"));
        System.out.println(name2.endsWith("an"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("a",2));
        info = "Karan is the best coder ever I aint lying";
        System.out.println(info.lastIndexOf("a"));
        System.out.println(info.lastIndexOf("a",5));
        System.out.println(name2.equals("Karan"));
        System.out.println(name2.equalsIgnoreCase("karan"));


    }
}
