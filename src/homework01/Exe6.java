package homework01;

import java.util.Scanner;

public class Exe6{
    // Main method
    public static void main(String[] args) {
        double radius, area;
        Scanner input = new Scanner(System.in);
        //Radius value of Circle
        System.out.println("Enter the radius of the circle");
        radius = input.nextDouble();
        input.close();
        //Formula of Area
        area= Math.PI * radius* radius;
        System.out.println("Area of the circle is "+ area);

    }
}
