package com.company;

import org.w3c.dom.ls.LSOutput;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter Total loan amount: ");
        int p = scanner2.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter Interest rate: ");
        double r = scanner3.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Enter No. of years on EMI: ");
        int y = scanner4.nextInt();
        double x = (1+(r/100));
        double z = Math.pow(x,(y*12));
        double m = (p*(r/100)*z)/(z-1);
        String formatted = NumberFormat.getCurrencyInstance().format(m);
        System.out.println("Amount to be paid monthly for " + y + " years is " + formatted);
    }
}
