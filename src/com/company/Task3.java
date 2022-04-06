package com.company;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner r1 = new Scanner(System.in);
        Scanner r2 = new Scanner(System.in);
        Scanner r3 = new Scanner(System.in);
        Scanner r4 = new Scanner(System.in);
        Scanner r5 = new Scanner(System.in);
        Scanner r6 = new Scanner(System.in);


        System.out.println("Введіть підмет і присудок першого числа: ");
        int d1 = r1.nextInt();
        int d2 = r2.nextInt();
        if (d1 > d2) {
            System.out.println("Перший дріб правильний: ");
        }
        else
            System.out.println("Ви ввели не правильний дріб!");


        System.out.println("Введіть підмет і присудок другого числа: ");
        int d3 = r3.nextInt();
        int d4 = r4.nextInt();
        if (d3 > d4) {
            System.out.println("Другий дріб правильний: ");
        }
        else
            System.out.println("Ви ввели не правильний дріб!");


        System.out.println("Введіть підмет і присудок третьго числа: ");
        int d5 = r5.nextInt();
        int d6 = r6.nextInt();
        if (d5 > d6) {
            System.out.println("Третій дріб правильний: ");}

        else
            System.out.println("Ви ввели не правильний дріб!");

        int a1, a2, a3;
        a1 = d1/d2;
        a2 = d3/d4;
        a3 = d5/d6;

        if (a1 > a2 && a1 > a3){
            System.out.println("Перший дріб найбільший");
        }
        if (a2 > a1 && a2 > a3){
            System.out.println("Другий дріб найбільший");
        }
        if (a3 > a1 && a3 > a2){
            System.out.println("Третій дріб найбільший");
        }
        else{
            System.out.println("Ви зробили щось не так");
        }
    }
}










