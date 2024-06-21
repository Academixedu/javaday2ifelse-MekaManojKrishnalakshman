package com.example;

import java.util.Scanner;

public class StudentGradeEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age=scanner.nextInt();
        System.out.print("Enter your exam score: ");
        int score=scanner.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Age: "  + age);
        System.out.println("Score: "  + score);



        if(score>=90){
            System.out.println("Grade : A");
        }
        else if(score>=80 && score<90){
            System.out.println("Grade : B");
         }
         else if (score>=70 && score<80){
            System.out.println("Grade : C");

         }
         else if(score>=60 && score<70){
            System.out.println("Grade : D");

         }
         else if(score>=50 && score<60){
            System.out.println("Grade : E");

         }
         else{
            System.out.println("Grade : F");

         }

        

        // Prompt the user to enter their age
        

        // Prompt the user to enter their exam score
        

        // Determine the grade
    
        

        // Print the student's details
        

       
    }
}
