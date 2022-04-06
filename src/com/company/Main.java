package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner r1 = new Scanner(System.in);
        Scanner r2 = new Scanner(System.in);
        Scanner r3 = new Scanner(System.in);
        Scanner r4 = new Scanner(System.in);
        Scanner r5 = new Scanner(System.in);


        System.out.println("Введіть речення з п'яти слів (вводити потрібно по одному слову): ");
        System.out.print(r1.nextLine().concat(r2.nextLine()).concat(r3.nextLine()).concat(r4.nextLine()).concat(r5.nextLine()));
    }
}
