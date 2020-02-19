package homework01;

import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        // Add two Binary
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter 1st Binary number");
        String i= s1.next();
        System.out.println("Enter 2nd Binary number");
        String j = s1.next();

        int n1 = Integer.parseInt(i,2);
        int n2 = Integer.parseInt(j, 2);
        int n3= n1 + n2;
        System.out.println("n1:" + Integer.toBinaryString(n1));
        System.out.println("n2:" + Integer.toBinaryString(n2));
        System.out.println("n3= n1+n2:" + Integer.toBinaryString(n3));
    }
}
