package dev.frankiewicz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name:");
//        String name = scanner.nextLine();
//
//        if (!name.isEmpty() && (!name.endsWith("a") || name.equals("Barnaba") || name.equals("Kuba"))){
//            System.out.println("Hello "+name+"!");
//            System.out.println("You are man.");
//        }else if(!name.isEmpty() && name.endsWith("a")){
//            System.out.println("Hello "+name+"!");
//            System.out.println("You are woman.");
//        }else {
//            System.out.println("You must enter your first name. Name cannot be empty!");
//        }
//        System.out.println("Enter your age:");
//        int age = scanner.nextInt();
//        if(age >= 18){
//            System.out.println("You are an adult.");
//        }else{
//            System.out.println("You are underage.");
//        }
//        //String Concatenation in Java
//        String firstName = "Mikołaj";
//        String lastName = "Frankiewicz";
//        System.out.println(firstName+" "+lastName);
        //Mathematical operators and numerical variables
        int a = 2;
        int b = 3;
        System.out.println("a="+a+" b="+b);
        System.out.println("Addition:"+(a+b));
        System.out.println("Subtraction:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division of an int variable:"+(a/b));
        double x = 2;
        double y = 3;
        System.out.println("\nx="+x+" y="+y);
        System.out.println("Division of a double variable:"+(x/y));
        a = 10;
        b = 2;
        System.out.println("\na="+a+" b="+b);
        System.out.println("The rest of the division:"+(a%b));
        a = 10;
        b = 3;
        System.out.println("\na="+a+" b="+b);
        System.out.println("The rest of the division:"+(a%b));
    }
}