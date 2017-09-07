package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner a = new Scanner (System.in);
System.out.println("Enter a number");

  int b = a.nextInt();
  int factorial = 1 ;
  for (int i = 1 ;i<=b ; i++ ){
  factorial = factorial*i;
}
  System.out.println(factorial);





    }
}
