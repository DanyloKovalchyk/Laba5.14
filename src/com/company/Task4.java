package com.company;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner r1 = new Scanner(System.in);
        Scanner r2 = new Scanner(System.in);

        System.out.println("Введіть 2 слова: ");
        String d1 = r1.nextLine();
        String d2 = r2.nextLine();

        System.out.println(d1.equals(d2));
    }
}
