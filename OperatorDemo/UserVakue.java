package OperatorDemo;

import java.util.Scanner;

public class UserVakue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,add;
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter tha value of b");
        b=sc.nextInt();
        add=a+b;
        System.out.println("the add is\t"+add);
    }
}
