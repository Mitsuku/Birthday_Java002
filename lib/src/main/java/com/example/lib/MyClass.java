package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter year");
        int year = sc.nextInt();
        System.out.println("enter mouth");
        int month = sc.nextInt();
        System.out.println("enter day");
        int day = sc.nextInt();
        System.out.println(year+"/"+month+"/"+day);
    }
}