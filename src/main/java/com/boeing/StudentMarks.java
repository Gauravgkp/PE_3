package com.boeing;
import java.util.Scanner;
import java.util.InputMismatchException;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] studentGrade;
        System.out.println("Please Enter number of students:");
        int numOfStudents = scan.nextInt();
        studentGrade = new int[numOfStudents];
            for (int a = 0; a < numOfStudents; a++) {
                try {
                    System.out.println("Please enter the grade of each students: " + (a+1));
                    Scanner scanTwo = new Scanner(System.in);
                    int studentMarks = scanTwo.nextInt();
                    try {
                        if (studentMarks < 0 || studentMarks > 100) {
                            throw new NotValidMarks("Grade cannot be less then 0 or more then 100");
                        }else {
                            studentGrade[a]= studentMarks;
                        }
                    }
                    catch (NotValidMarks gradeException)
                    {
                        System.out.println(gradeException.getMessage());
                        a--;
                    }
                }catch (InputMismatchException e) {
                    System.out.println(e);
                    a--;}
            }
        System.out.println("Thanks for entering all students marks!");
        }
    }

    class NotValidMarks extends Exception {
        public NotValidMarks(String s) {
            // Call constructor of parent Exception
            super(s);
        }

    }
