package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //nt[] numbers = {2,3,4,5,1};
		//System.out.println(numbers.length);
		//Arrays.sort(numbers);
		//System.out.println(Arrays.toString(numbers));
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("Age: ");
		int age = scanner1.nextInt();
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Name: ");
		String name = scanner2.nextLine();
		System.out.println("Hello " + name.toUpperCase());
 		System.out.println("you are " + age + " years old.");
 		double m = Math.pow(2,2);
		System.out.println(m);
    }
}
