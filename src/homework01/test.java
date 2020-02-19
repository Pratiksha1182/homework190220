package homework01;

public class test {
    // Declaration of one instance variable
    int a = 1;
    // Declaration of one static variable
    static int b = 2;
    //Declaration of instance method
    public void addition(){
        System.out.println("addition of a and b = "+(a+b));
    }
    // Declaration of static method
    public static void subtraction(){
        test obj= new test();
        System.out.println("subtraction of a and b=" +(obj.a-b));
    }
    // Declaration of main method
    public static void main(String[] args) {
        // Call of instance and static method in main method
        test obj= new test();
        obj.addition();
        subtraction();
    }
}