package com.company;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner r1 = new Scanner(System.in);
        Scanner r2 = new Scanner(System.in);
        Scanner r3 = new Scanner(System.in);
        Scanner r4 = new Scanner(System.in);
        Scanner r5 = new Scanner(System.in);
        Scanner r6 = new Scanner(System.in);

        System.out.println("Ведіть повну назву нашого університету: ");
        System.out.print("Абревіатура: "+r1.nextLine().substring(0,1) + r2.nextLine().substring(0,1)+r3.nextLine().substring(0,1)+r4.nextLine().substring(0,1)+r5.nextLine().substring(0,1)+r6.nextLine().substring(0,1));
    }
}
