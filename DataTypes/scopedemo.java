package DataTypes;

public class scopedemo {
    // instance variale,global scope
    float pi = 3.14f;

    void circlearea() { // local variabale ,local scope
        int r = 10;
        float area = pi * r * r;
        System.out.println("circle area is\t" + area);
    }

    /*
     * void area()
     * {
     * System.out.println("circle area is\t"+area);
     * System.out.println("pi value is\t"+pi);
     * }
     */
    public static void main(String[] args) {
        scopedemo sd = new scopedemo();
        sd.circlearea();
        // sd.Area();

    }
}
 