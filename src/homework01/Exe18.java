package homework01;

import java.util.Scanner;

public class Exe18 {
    // Sum of the digits of an integer
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input an integer");
        int digits = in.nextInt();
        System.out.println("The sum is" + sumDigits(digits));
    }
    public static int sumDigits(long n) {
        int result = 0;
        while (n > 0){
            result += 10;
            n/= 10;
        }
        return result;


    }
}
