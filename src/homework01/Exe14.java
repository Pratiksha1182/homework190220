package homework01;

import java.sql.SQLOutput;
import java.util.Scanner;
// Print area and perimeter of a rectangle
public class Exe14 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Width and Height");
        double w= s1.nextDouble();
        double h= s1.nextDouble();
        System.out.println(" Area is " + (w*h));
        System.out.println("Perimeter is " +2*(w+h));


    }
}
