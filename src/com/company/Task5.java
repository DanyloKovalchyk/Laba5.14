package com.company;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner r1 = new Scanner(System.in);
        Scanner r2 = new Scanner(System.in);

        System.out.println("Введіть 2 слова: ");
        String d1 = r1.nextLine();
        String d2 = r2.nextLine();

        System.out.println(d1.length());
        System.out.println(d2.length());
        if(d1.length() > d2.length()){
            System.out.println("В першому елементі більше символів.");
        }
        else {
            System.out.println("В другому елементі більше символів.");
        }
    }
}
