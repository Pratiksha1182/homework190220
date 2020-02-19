package homework01;

import java.util.Scanner;

public class Exe12 {
    //compute the specified expressions and print the output
    public static void main(String[] args) {
        double i, j, k, l, result;
        Scanner s1= new Scanner(System.in);
        System.out.println("Please enter i");
        i = s1.nextDouble();
        System.out.println("Please enter j");
        j = s1.nextDouble();
        System.out.println("Please enter k");
        k = s1.nextDouble();
        System.out.println(" Please enter l");
        l = s1.nextDouble();
        System.out.println("Test data");
        System.out.println("(("+i+"*"+j+"-"+j+"*"+j+")/("+k+"-"+l+"))");
        result= ((i*j-j*j)/(k-l));
        System.out.println("Expected output" +result);

    }
}
