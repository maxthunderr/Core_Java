package Variables_DataTypes;

import java.util.Scanner;

public class VariablesDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the namre");
        String name = sc.next();

        System.out.println("Enter the age");
        int age = sc.nextInt();

        System.out.println("Enter the height");
        float height = sc.nextFloat();

        System.out.println("Enter the per");
        double per = sc.nextDouble();

        System.out.println("User male");
        boolean male = sc.nextBoolean();

        System.out.println("Enter the gender");
        String gender = sc.next();

        System.out.println("Enter the mob");
        long mob = sc.nextLong();

        

        System.out.println("Nmaeis \t"+name);
        System.out.println("Age is \t"+age);
        System.out.println("Height is \t"+height);
        System.out.println("Per is \t"+per);
        System.out.println("Gender is \t"+gender);
        System.out.println("Are you male\t"+male);
        System.out.println("Mod no is\t"+mob);

    }
}
