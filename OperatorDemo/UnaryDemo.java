package OperatorDemo;

public class UnaryDemo {
    public static void main(String[] args) {
        // prefix imcrement
        int a = 10;
        System.out.println("original a value is\t" + a);
        System.out.println("after increment a value is\t" + (++a));
        System.out.println("after updation a value is \t" + a);
        System.out.println("...................................");

        // postfix increment
        int b = 10;
        System.out.println("original a value is\t" + b);
        System.out.println("after increment a value is\t" + (b++));
        System.out.println("after updation a value is \t" + b);
        System.out.println("...................................");

        // prefix decrement
        int c = 20;
        System.out.println("original a value is\t" + c);
        System.out.println("after increment a value is\t" + (--c));
        System.out.println("after updation a value is \t" + c);
        System.out.println(".....................................");

        // postfix decrement
        int d = 20;
        System.out.println("original a value is\t" + d);
        System.out.println("after increment a value is\t" + (d--));
        System.out.println("after updation a value is \t" + d);
        System.out.println(".........................................");

    }

}
