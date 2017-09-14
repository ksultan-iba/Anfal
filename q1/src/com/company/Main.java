package com.company;

import java.util.Scanner;
//meaningful names of variables and javadocs
public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the number which is gretaer than 0");

        int b = a.nextInt();
        int sum = 0;
        for (int i = 1; i <= b; i++) {
            sum = sum + i;

        }
        System.out.println("the sum of the first " + b + " integer is " + sum );
    }
}
