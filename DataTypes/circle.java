package DataTypes;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi, r, area;
        System.out.println("enter the value of pi");
        pi = sc.nextFloat();
        System.out.println("enter the value of r");
        r = sc.nextFloat();

        area = pi * r * r;
        System.out.println("the area is\t" + area);
    }
}
