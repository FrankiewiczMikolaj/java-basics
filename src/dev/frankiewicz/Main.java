package dev.frankiewicz;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Definition of the scanner that will be used to capture data entered by the console
        Scanner scanner = new Scanner(System.in);
        //region The if-else conditional statement, logical AND/OR operators
//        System.out.println("Enter your name:");
//        String name = scanner.nextLine();
//        if (!name.isEmpty() && (!name.endsWith("a") || name.equals("Barnaba") || name.equals("Kuba"))){
//            System.out.println("Hello "+name+"!");
//            System.out.println("You are man.");
//        }else if(!name.isEmpty() && name.endsWith("a")){
//            System.out.println("Hello "+name+"!");
//            System.out.println("You are woman.");
//        }else {
//            System.out.println("You must enter your first name. Name cannot be empty!");
//        }
        //endregion
        //region Checking if a person is an adult based on the entered age
//        System.out.println("Enter your age:");
//        int age = scanner.nextInt();
//        if(age >= 18){
//            System.out.println("You are an adult.");
//        }else{
//            System.out.println("You are underage.");
//        }
        //endregion
        //region String Concatenation
//        String firstName = "Mikołaj";
//        String lastName = "Frankiewicz";
//        System.out.println(firstName+" "+lastName);
        //endregion
        //region Mathematical operators and numerical variables
//        int a = 2;
//        int b = 3;
//        System.out.println("a="+a+" b="+b);
//        System.out.println("Addition:"+(a+b));
//        System.out.println("Subtraction:"+(a-b));
//        System.out.println("Multiplication:"+(a*b));
//        System.out.println("Division:"+(a/b));
//        double x = 2;
//        double y = 3;
//        System.out.println("\nx="+x+" y="+y);
//        System.out.println("Division:"+(x/y));
//        a = 10;
//        b = 2;
//        System.out.println("\na="+a+" b="+b);
//        System.out.println("The rest of the division:"+(a%b));
//        a = 10;
//        b = 3;
//        System.out.println("\na="+a+" b="+b);
//        System.out.println("The rest of the division:"+(a%b));
        //endregion
        //region Comparison operators, boolean variables
//        int numberA = 10;
//        int numberB = 3;
//        System.out.println(numberA > numberB);
//        System.out.println(numberA < numberB);
//        System.out.println(numberA == numberB);
//        System.out.println(numberA != numberB);
//
//        boolean isSkyBlue = true;
//        if (isSkyBlue){
//            System.out.println("Sky is Blue");
//        }else {
//            System.out.println("Sky is not Blue");
//        }
        //endregion
        //region For loop
//        System.out.println("For loop #1");
//        for (int z = 0; z< 10; z++){
//            System.out.println(z);
//        }
//        System.out.println("For loop #2");
//        for (int i = 0, j = 10; i < 10; i++, j--){
//            System.out.println(i);
//            System.out.println(j);
//            System.out.println();
//        }
        //endregion
        //region While loop
//        int i = 0;
//        System.out.println("While loop #1");
//        while (i < 10){
//            System.out.println("i is less than 10");
//            i++;
//        }
//        boolean isSunYellow = false;
//        System.out.println("While loop #2");
//        do{
//            System.out.println("Sun is Yellow");
//        }while (isSunYellow);
        //endregion
        //region Break and continue statements
//        System.out.println("For loop with break");
//        for (int i = 0; i<10; i++){
//            if (i == 4){
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("For loop with continue");
//        for (int j = 0; j<10; j++){
//            if (j == 4){
//                continue;
//            }
//            System.out.println(j);
//        }
        //endregion
        //region FizzBuzz
//        for (int i = 1; i < 101; i++){
//            if (i % 15 == 0){
//                System.out.println("FizzBuzz");
//            }
//            else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
        //endregion
        //region The second application - guessing the number drawn by the computer
//        Random random = new Random();
//        int numberToGuess = random.nextInt(100)+1;
//        boolean wasNumberGuessed = false;
//        while(!wasNumberGuessed){
//            System.out.println("Enter a number");
//            int userNumber = scanner.nextInt();
//            if (userNumber < numberToGuess){
//                System.out.println("Number is too low.");
//            } else if (userNumber > numberToGuess) {
//                System.out.println("Number is too high.");
//            }else {
//                System.out.println("Congratulations! You have guessed the number.");
//                wasNumberGuessed = true;
//            }
//        }
        //endregion
        //region Arrays
        String[] names = new String[4];
        names[0] = "Mariusz";
        names[1] = "Dominik";
        names[2] = "Kasia";
        names[3] = "Asia";
        for (int i = 0; i< names.length; i++){
            System.out.println(names[i]);
        }
        names[2] = "Rafał";
        System.out.println();
        for (int i = 0; i< names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println();
        String[] animals = {"dog","cat","turtle","elephant","lion"};
        for (String animal : animals){
            System.out.println(animal);
        }
        //endregion
    }
}