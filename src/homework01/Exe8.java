package homework01;

import java.util.Scanner;

public class Exe8 {
    public void calcAreaOfTringle(int h, int b){
        double result;
        result = (h* b)/2;
        System.out.println(("The area of Triangle is "+ result));
    }
    public static void main(String[] args) {
        int height, base;
        Scanner s1= new Scanner(System.in);
        System.out.println(" Lets calculate area of Triangle");
        Object system;
        System.out.println("Pease enter the height of Triangle");
        height= s1.nextInt();
        System.out.println("Please enter the base of Triangle");
        base= s1.nextInt();
        Exe8 obj= new Exe8();
        obj.calcAreaOfTringle(height, base);

    }
}
