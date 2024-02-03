package SwitchDemo;

import java.util.Scanner;

public class SitchCase {
    public static void main(String[] args) {
        System.out.println("enter your fav color");
        Scanner sc =new Scanner( System.in);
        String color = sc.next();
        switch (color) {
            case "B":
                System.out.println("you like black color");
                break;
            case "R":
                System.out.println("you like Red color");
                break;
             case "G":
                System.out.println("you like Green color");
                break;
            default:
                System.out.println("you dont like anything");
                break;
        }
    }
}
