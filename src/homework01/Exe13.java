package homework01;

import java.util.Scanner;
public class Exe13 {
    // Print average of the numbers
    public static void main(String[] args) {
        Scanner accept = new Scanner(System.in);
        System.out.print("Enter first number");
        int a= accept.nextInt();
        System.out.print("Enter second number");
        int b= accept.nextInt();
        System.out.print("Enter Third number");
        int c= accept.nextInt();
        System.out.println("The average of three numbers is" +(a+b+c)/3);

    }

}
