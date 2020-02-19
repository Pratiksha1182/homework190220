package homework01;

public class Exe15 {
    public static void main(String[] args) {
        // Swap x and y
        int x, y, temp;
        x=10;
        y=20;
        System.out.println("Before swapping x, y = "+x+", "+ + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping x, y = "+x+", "+ + y);

    }
}
