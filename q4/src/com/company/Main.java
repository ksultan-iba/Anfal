package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);


int in;
 int ni;
 double cc;
 double r;
 double time;
 double s;
 System.out.println(" \"1\" for instruction Set 1");
 System.out.println("  \"2\" for instruction Set 2");
System.out.println(" \"3\" to end ");

do {
 System.out.println("Enter your instruction number");
 in = a.nextInt();


if(in == 1){
 System.out.println("Enter the number of instructions");
    ni = a.nextInt();
 System.out.println("Enter the cycle count you want");
   cc = a.nextDouble();
 System.out.println("Enter the Rate (Mhz)");
    r = 1/(a.nextDouble()* 1000000);
time =( ni * cc * r);
 System.out.println("The time required is: " + time + " Seconds");
}


 else if(in ==2){
 System.out.println("Enter the number of instructions");
ni = a.nextInt();
 System.out.println("Enter the seconds required per instruction");
 s = a.nextDouble();
 time = (s * ni);
 System.out.println("The time required is: " + time + " Seconds");
 }

 //else if (in==3)


}
while ( in != 3);

 }

}


