package DataTypes;

public class TypeCastingdemo {
     public static void main(String[] args) {
        //code for implicit  
        int a=10;
        System.out.println("value of a is"+a);
        float b=20;
        System.out.println("value of b is"+b);
        float div=a/b;
        System.out.println("div is\t"+div);
        

        //code for explicit
        float c=10.00f;
        System.out.println("float value is"+c);
        int d=(int)c;
        System.out.println("int d value is"+d);

        //int to double and double to int
     }
}
    