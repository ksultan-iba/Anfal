package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


                Scanner a = new Scanner(System.in);
                //allowing it to take input
                System.out.println("Enter a number greater than 1: ");


                int[][] arr = new int[13][13];
                // declaring an array
                int num;
                num = a.nextInt();



                for(int i=1; i <= arr.length-1; i++)
                {
                    for (int j=1; j <= arr[0].length-1; j++)
                    {
//generating the array
                        arr[i][j] = i*j % num;
                        if (arr[i][j] < 10)
                            System.out.print("  " + arr[i][j] + " ");
                        else
                        if (arr[i][j] > 10 && arr[i][j] < 100)
                            System.out.print(" " + arr[i][j] + " ");
                        else
                            System.out.print(arr[i][j] + " ");
                    }
                    System.out.println(" ");
                }

            }
}
