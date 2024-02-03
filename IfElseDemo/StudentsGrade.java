package IfElseDemo;

import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your markas");
        marks = sc.nextInt();
        if (marks <= 70) {
            System.out.println("Grade is O");
        } else if (marks < 70 && marks > 60) {
            System.out.println("Grade is A");
        } else

        if (marks < 60 && marks > 50) {
            System.out.println("Grade is B");
        } else if (marks < 50 && marks > 40) {
            System.out.println("Grade is C");

        } else {
            System.out.println("Grade is F");
        }

    }
}
