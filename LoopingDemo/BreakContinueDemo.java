package LoopingDemo;

public class BreakContinueDemo {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=20;i++)
        {
            if(i==6)
            {
                break;
            }
            System.out.println(i);
        }
        for(i=1;i<=20;i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }
    
}
