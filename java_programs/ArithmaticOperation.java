// Java program to enter two numbers and perform all arithmetic operations
import java.util.Scanner;

public class ArithmaticOperation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any two positive integer numbers:");

        // Reading data using readLine
        int p = in.nextInt();
        int q = in.nextInt();
        int sum, sub, mul, mod;
        float div;

        sum = p + q;
        sub = p - q;
        mul = p * q;
        div = p / q;
        mod = p % q;

        System.out.println("\nSUM         " + p + " + " + q + " = " + sum);
        System.out.println("DIFFERENCE  " + p + " - " + q + " = " + sub);
        System.out.println("PRODUCT     " + p + " * " + q + " = " + mul);
        System.out.println("QUOTIENT    " + p + " / " + q + " = " + div);
        System.out.println("MODULUS     " + p + " % " + q + " = " + mod);
    }
}
