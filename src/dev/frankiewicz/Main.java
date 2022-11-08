package dev.frankiewicz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        if (!name.isEmpty() && (!name.endsWith("a") || name.equals("Barnaba") || name.equals("Kuba"))){
            System.out.println("Hello "+name+"!");
            System.out.println("You are man.");
        }else if(!name.isEmpty() && name.endsWith("a")){
            System.out.println("Hello "+name+"!");
            System.out.println("You are woman.");
        }else {
            System.out.println("You must enter your first name. Name cannot be empty!");
        }
    }
}